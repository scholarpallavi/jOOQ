/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.db2.DB2DataType;
import org.jooq.util.db2.syscat.Syscat;
import org.jooq.util.db2.syscat.tables.records.ReferencesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class References extends TableImpl<ReferencesRecord> {

	private static final long serialVersionUID = 730601440;

	/**
	 * The singleton instance of REFERENCES
	 */
	public static final References REFERENCES = new References();

	/**
	 * The class holding records for this type
	 */
	private static final Class<ReferencesRecord> __RECORD_TYPE = ReferencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReferencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> CONSTNAME = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "CONSTNAME", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> TABSCHEMA = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "TABSCHEMA", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> TABNAME = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "TABNAME", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> OWNER = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "OWNER", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> OWNERTYPE = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "OWNERTYPE", DB2DataType.CHARACTER, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> REFKEYNAME = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "REFKEYNAME", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> REFTABSCHEMA = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "REFTABSCHEMA", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> REFTABNAME = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "REFTABNAME", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, Short> COLCOUNT = new TableFieldImpl<ReferencesRecord, Short>(SQLDialect.DB2, "COLCOUNT", DB2DataType.SMALLINT, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> DELETERULE = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "DELETERULE", DB2DataType.CHARACTER, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> UPDATERULE = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "UPDATERULE", DB2DataType.CHARACTER, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, Timestamp> CREATE_TIME = new TableFieldImpl<ReferencesRecord, Timestamp>(SQLDialect.DB2, "CREATE_TIME", DB2DataType.TIMESTAMP, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> FK_COLNAMES = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "FK_COLNAMES", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> PK_COLNAMES = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "PK_COLNAMES", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<ReferencesRecord, String> DEFINER = new TableFieldImpl<ReferencesRecord, String>(SQLDialect.DB2, "DEFINER", DB2DataType.VARCHAR, REFERENCES);

	/**
	 * No further instances allowed
	 */
	private References() {
		super(SQLDialect.DB2, "REFERENCES", Syscat.SYSCAT);
	}
}
