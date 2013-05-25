/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -305394590;

	/**
	 * The singleton instance of <code>TEST</code>
	 */
	public static final Test TEST = new Test();

	/**
	 * No further instances allowed
	 */
	private Test() {
		super("TEST");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.derby.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.derby.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.derby.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.derby.generatedclasses.tables.T_785.T_785,
			org.jooq.test.derby.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.derby.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.derby.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.derby.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.derby.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.derby.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.derby.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.derby.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.derby.generatedclasses.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.derby.generatedclasses.tables.TTriggers.T_TRIGGERS,
			org.jooq.test.derby.generatedclasses.tables.TUnsigned.T_UNSIGNED,
			org.jooq.test.derby.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.derby.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.derby.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.derby.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025,
			org.jooq.test.derby.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69,
			org.jooq.test.derby.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71,
			org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.derby.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
