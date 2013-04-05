/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class SakilaSakila extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1724553150;

	/**
	 * The singleton instance of <code>sakila</code>
	 */
	public static final SakilaSakila SAKILA = new SakilaSakila();

	/**
	 * No further instances allowed
	 */
	private SakilaSakila() {
		super("sakila");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.examples.mysql.sakila.tables.SakilaActor.ACTOR,
			org.jooq.examples.mysql.sakila.tables.SakilaActorInfo.ACTOR_INFO,
			org.jooq.examples.mysql.sakila.tables.SakilaAddress.ADDRESS,
			org.jooq.examples.mysql.sakila.tables.SakilaCategory.CATEGORY,
			org.jooq.examples.mysql.sakila.tables.SakilaCity.CITY,
			org.jooq.examples.mysql.sakila.tables.SakilaCountry.COUNTRY,
			org.jooq.examples.mysql.sakila.tables.SakilaCustomer.CUSTOMER,
			org.jooq.examples.mysql.sakila.tables.SakilaCustomerList.CUSTOMER_LIST,
			org.jooq.examples.mysql.sakila.tables.SakilaFilm.FILM,
			org.jooq.examples.mysql.sakila.tables.SakilaFilmActor.FILM_ACTOR,
			org.jooq.examples.mysql.sakila.tables.SakilaFilmCategory.FILM_CATEGORY,
			org.jooq.examples.mysql.sakila.tables.SakilaFilmList.FILM_LIST,
			org.jooq.examples.mysql.sakila.tables.SakilaFilmText.FILM_TEXT,
			org.jooq.examples.mysql.sakila.tables.SakilaInventory.INVENTORY,
			org.jooq.examples.mysql.sakila.tables.SakilaLanguage.LANGUAGE,
			org.jooq.examples.mysql.sakila.tables.SakilaNicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST,
			org.jooq.examples.mysql.sakila.tables.SakilaPayment.PAYMENT,
			org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL,
			org.jooq.examples.mysql.sakila.tables.SakilaSalesByFilmCategory.SALES_BY_FILM_CATEGORY,
			org.jooq.examples.mysql.sakila.tables.SakilaSalesByStore.SALES_BY_STORE,
			org.jooq.examples.mysql.sakila.tables.SakilaStaff.STAFF,
			org.jooq.examples.mysql.sakila.tables.SakilaStaffList.STAFF_LIST,
			org.jooq.examples.mysql.sakila.tables.SakilaStore.STORE);
	}
}