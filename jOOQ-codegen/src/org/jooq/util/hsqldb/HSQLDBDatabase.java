/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.util.hsqldb;

import static org.jooq.util.hsqldb.information_schema.tables.Columns.COLUMNS;
import static org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE;
import static org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;
import static org.jooq.util.hsqldb.information_schema.tables.Routines.ROUTINES;
import static org.jooq.util.hsqldb.information_schema.tables.Sequences.SEQUENCES;
import static org.jooq.util.hsqldb.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;
import static org.jooq.util.hsqldb.information_schema.tables.Tables.TABLES;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.Factory;
import org.jooq.util.AbstractDatabase;
import org.jooq.util.ArrayDefinition;
import org.jooq.util.ColumnDefinition;
import org.jooq.util.DefaultRelations;
import org.jooq.util.DefaultSequenceDefinition;
import org.jooq.util.EnumDefinition;
import org.jooq.util.FunctionDefinition;
import org.jooq.util.PackageDefinition;
import org.jooq.util.ProcedureDefinition;
import org.jooq.util.SequenceDefinition;
import org.jooq.util.TableDefinition;
import org.jooq.util.UDTDefinition;
import org.jooq.util.hsqldb.information_schema.tables.Columns;
import org.jooq.util.hsqldb.information_schema.tables.ConstraintColumnUsage;
import org.jooq.util.hsqldb.information_schema.tables.KeyColumnUsage;
import org.jooq.util.hsqldb.information_schema.tables.Routines;
import org.jooq.util.hsqldb.information_schema.tables.TableConstraints;
import org.jooq.util.hsqldb.information_schema.tables.Tables;
import org.jooq.util.postgres.information_schema.tables.Sequences;

/**
 * @author Lukas Eder
 */
public class HSQLDBDatabase extends AbstractDatabase {

	@Override
	protected void loadPrimaryKeys(DefaultRelations relations) throws SQLException {
		Result<Record> result = create().select()
			.from(TABLE_CONSTRAINTS)
			.join(CONSTRAINT_COLUMN_USAGE)
			.on(TableConstraints.CONSTRAINT_NAME.equal(ConstraintColumnUsage.CONSTRAINT_NAME))
			.join(COLUMNS)
			.on(ConstraintColumnUsage.TABLE_SCHEMA.equal(Columns.TABLE_SCHEMA)
			.and(ConstraintColumnUsage.TABLE_NAME.equal(Columns.TABLE_NAME))
			.and(ConstraintColumnUsage.COLUMN_NAME.equal(Columns.COLUMN_NAME)))
			.where(TableConstraints.CONSTRAINT_TYPE.equal("PRIMARY KEY")
			.and(ConstraintColumnUsage.TABLE_SCHEMA.equal(getSchemaName())))
			.orderBy(
			    Columns.TABLE_SCHEMA.ascending(),
			    Columns.TABLE_NAME.ascending(),
			    Columns.ORDINAL_POSITION.ascending())
			.fetch();

		for (Record record : result) {
			String key = record.getValue(TableConstraints.CONSTRAINT_NAME);
			String tableName = record.getValue(ConstraintColumnUsage.TABLE_NAME);
			String columnName = record.getValue(ConstraintColumnUsage.COLUMN_NAME);

			TableDefinition table = getTable(tableName);
			if (table != null) {
			    relations.addPrimaryKey(key, table.getColumn(columnName));
			}
		}
	}

	@Override
	protected void loadForeignKeys(DefaultRelations relations) throws SQLException {
		Result<Record> result = create().select()
			.from(CONSTRAINT_COLUMN_USAGE)
			.join(KEY_COLUMN_USAGE)
			.on(ConstraintColumnUsage.CONSTRAINT_NAME.equal(KeyColumnUsage.CONSTRAINT_NAME))
			.join(TABLE_CONSTRAINTS)
			.on(ConstraintColumnUsage.CONSTRAINT_NAME.equal(TableConstraints.CONSTRAINT_NAME))
			.join(COLUMNS)
			.on(ConstraintColumnUsage.TABLE_SCHEMA.equal(Columns.TABLE_SCHEMA)
			.and(ConstraintColumnUsage.TABLE_NAME.equal(Columns.TABLE_NAME))
			.and(ConstraintColumnUsage.COLUMN_NAME.equal(Columns.COLUMN_NAME)))
			.where(TableConstraints.CONSTRAINT_TYPE.equal("FOREIGN KEY")
			.and(KeyColumnUsage.TABLE_SCHEMA.equal(getSchemaName())))
			.orderBy(
			    Columns.TABLE_SCHEMA.ascending(),
			    Columns.TABLE_NAME.ascending(),
			    Columns.ORDINAL_POSITION.ascending())
			.fetch();

		for (Record record : result) {
			String key = record.getValue(TableConstraints.CONSTRAINT_NAME);
			String referencingTableName = record.getValue(KeyColumnUsage.TABLE_NAME);
			String referencingColumnName = record.getValue(KeyColumnUsage.COLUMN_NAME);
			String referencedTableName = record.getValue(ConstraintColumnUsage.TABLE_NAME);
			String referencedColumnName = record.getValue(ConstraintColumnUsage.COLUMN_NAME);

			TableDefinition referencingTable = getTable(referencingTableName);
			TableDefinition referencedTable = getTable(referencedTableName);

			if (referencingTable != null && referencedTable != null) {
			    ColumnDefinition referencingColumn = referencingTable.getColumn(referencingColumnName);
			    ColumnDefinition referencedColumn = referencedTable.getColumn(referencedColumnName);

			    String primaryKey = relations.getPrimaryKeyName(referencedColumn);
			    relations.addForeignKey(key, primaryKey, referencingColumn);
			}
		}
	}

    @Override
    protected List<SequenceDefinition> getSequences0() throws SQLException {
        List<SequenceDefinition> result = new ArrayList<SequenceDefinition>();

        for (String name : create().select(Sequences.SEQUENCE_NAME)
            .from(SEQUENCES)
            .where(Sequences.SEQUENCE_SCHEMA.equal(getSchemaName()))
            .orderBy(Sequences.SEQUENCE_NAME)
            .fetch(Sequences.SEQUENCE_NAME)) {

            result.add(new DefaultSequenceDefinition(this, name));
        }

        return result;
    }

	@Override
	protected List<TableDefinition> getTables0() throws SQLException {
		List<TableDefinition> result = new ArrayList<TableDefinition>();

        for (String name : create().select(Tables.TABLE_NAME)
            .from(TABLES)
            .where(Tables.TABLE_SCHEMA.equal(getSchemaName()))
            .orderBy(Tables.TABLE_NAME)
            .fetch(Tables.TABLE_NAME)) {

			String comment = "";
			HSQLDBTableDefinition table = new HSQLDBTableDefinition(this, name, comment);
			result.add(table);
		}

		return result;
	}

    @Override
    protected List<EnumDefinition> getEnums0() throws SQLException {
        List<EnumDefinition> result = new ArrayList<EnumDefinition>();
        return result;
    }

    @Override
    protected List<UDTDefinition> getUDTs0() throws SQLException {
        List<UDTDefinition> result = new ArrayList<UDTDefinition>();
        return result;
    }

    @Override
    protected List<ArrayDefinition> getArrays0() throws SQLException {
        List<ArrayDefinition> result = new ArrayList<ArrayDefinition>();
        return result;
    }

	@Override
	protected List<ProcedureDefinition> getProcedures0() throws SQLException {
		List<ProcedureDefinition> result = new ArrayList<ProcedureDefinition>();

        for (Record record : create().select(
                Routines.ROUTINE_NAME,
                Routines.SPECIFIC_NAME)
            .from(ROUTINES)
            .where(Routines.ROUTINE_SCHEMA.equal(getSchemaName()))
            .and(Routines.ROUTINE_TYPE.equal("PROCEDURE"))
            .orderBy(Routines.ROUTINE_NAME)
            .fetch()) {

            String name = record.getValue(Routines.ROUTINE_NAME);
            String specificName = record.getValue(Routines.SPECIFIC_NAME);

            HSQLDBProcedureDefinition procedure = new HSQLDBProcedureDefinition(this, null, name, specificName);
            result.add(procedure);
        }

        return result;
	}

    @Override
    protected List<FunctionDefinition> getFunctions0() throws SQLException {
        List<FunctionDefinition> result = new ArrayList<FunctionDefinition>();

        for (Record record : create().select(
                Routines.ROUTINE_NAME,
                Routines.SPECIFIC_NAME,
                Routines.DATA_TYPE)
            .from(ROUTINES)
            .where(Routines.ROUTINE_SCHEMA.equal(getSchemaName()))
            .and(Routines.ROUTINE_TYPE.equal("FUNCTION"))
            .orderBy(Routines.ROUTINE_NAME)
            .fetch()) {

            String name = record.getValue(Routines.ROUTINE_NAME);
            String specificName = record.getValue(Routines.SPECIFIC_NAME);
            String dataType = record.getValue(Routines.DATA_TYPE);

            HSQLDBFunctionDefinition function = new HSQLDBFunctionDefinition(this, name, specificName);
            function.setReturnValue(dataType);
            result.add(function);
        }
        return result;
    }

    @Override
    protected List<PackageDefinition> getPackages0() throws SQLException {
        List<PackageDefinition> result = new ArrayList<PackageDefinition>();
        return result;
    }

    @Override
    public Factory create() {
        return new Factory(getConnection(), SQLDialect.HSQLDB);
    }
}
