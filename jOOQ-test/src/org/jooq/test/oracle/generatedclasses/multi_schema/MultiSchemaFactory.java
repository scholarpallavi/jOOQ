/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema;

/**
 * This class is generated by jOOQ.
 *
 * A Factory for specific use with the <code>MULTI_SCHEMA</code> schema.
 * <p>
 * This Factory will not render the <code>MULTI_SCHEMA</code> schema's schema
 * name in rendered SQL (assuming that you use it as the default schema on
 * your connection!). Use the more generic {@link org.jooq.util.oracle.OracleFactory}
 * or the {@link org.jooq.impl.Factory} instead, if you want to fully qualify
 * tables, routines, etc.
 */
public class MultiSchemaFactory extends org.jooq.util.oracle.OracleFactory {

	private static final long serialVersionUID = -1286222734;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public MultiSchemaFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 *
	 * @deprecated - 2.0.5 - Use {@link #MultiSchemaFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public MultiSchemaFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public MultiSchemaFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}
