/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.h2.H2DataType;
import org.jooq.util.h2.information_schema.InformationSchema;
import org.jooq.util.h2.information_schema.tables.records.CrossReferencesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class CrossReferences extends TableImpl<CrossReferencesRecord> {

	private static final long serialVersionUID = 1218842217;

	/**
	 * The singleton instance of CROSS_REFERENCES
	 */
	public static final CrossReferences CROSS_REFERENCES = new CrossReferences();

	/**
	 * The class holding records for this type
	 */
	private static final Class<CrossReferencesRecord> __RECORD_TYPE = CrossReferencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<CrossReferencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> PKTABLE_CATALOG = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "PKTABLE_CATALOG", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> PKTABLE_SCHEMA = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "PKTABLE_SCHEMA", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> PKTABLE_NAME = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "PKTABLE_NAME", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> PKCOLUMN_NAME = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "PKCOLUMN_NAME", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> FKTABLE_CATALOG = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "FKTABLE_CATALOG", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> FKTABLE_SCHEMA = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "FKTABLE_SCHEMA", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> FKTABLE_NAME = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "FKTABLE_NAME", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> FKCOLUMN_NAME = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "FKCOLUMN_NAME", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, Short> ORDINAL_POSITION = new TableFieldImpl<CrossReferencesRecord, Short>(SQLDialect.H2, "ORDINAL_POSITION", H2DataType.SMALLINT, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, Short> UPDATE_RULE = new TableFieldImpl<CrossReferencesRecord, Short>(SQLDialect.H2, "UPDATE_RULE", H2DataType.SMALLINT, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, Short> DELETE_RULE = new TableFieldImpl<CrossReferencesRecord, Short>(SQLDialect.H2, "DELETE_RULE", H2DataType.SMALLINT, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> FK_NAME = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "FK_NAME", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, String> PK_NAME = new TableFieldImpl<CrossReferencesRecord, String>(SQLDialect.H2, "PK_NAME", H2DataType.VARCHAR, CROSS_REFERENCES);

	/**
	 * An uncommented item
	 */
	public static final TableField<CrossReferencesRecord, Short> DEFERRABILITY = new TableFieldImpl<CrossReferencesRecord, Short>(SQLDialect.H2, "DEFERRABILITY", H2DataType.SMALLINT, CROSS_REFERENCES);

	/**
	 * No further instances allowed
	 */
	private CrossReferences() {
		super(SQLDialect.H2, "CROSS_REFERENCES", InformationSchema.INFORMATION_SCHEMA);
	}
}
