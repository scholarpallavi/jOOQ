/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITBookToBookStore extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
	 */
	public void setBookStoreName(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
	 */
	public java.lang.String getBookStoreName();

	/**
	 * Setter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>.
	 */
	public void setBookId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>.
	 */
	public java.lang.Integer getBookId();

	/**
	 * Setter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.STOCK</code>.
	 */
	public void setStock(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.STOCK</code>.
	 */
	public java.lang.Integer getStock();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITBookToBookStore
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBookToBookStore from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITBookToBookStore
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBookToBookStore> E into(E into);
}
