/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.db2.syscat.tables.Funcparms;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FuncparmsRecord extends TableRecordImpl<FuncparmsRecord> {

	private static final long serialVersionUID = 1524113571;

	/**
	 * An uncommented item
	 */
	public void setFuncschema(String value) {
		setValue(Funcparms.FUNCSCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getFuncschema() {
		return getValue(Funcparms.FUNCSCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setFuncname(String value) {
		setValue(Funcparms.FUNCNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getFuncname() {
		return getValue(Funcparms.FUNCNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setSpecificname(String value) {
		setValue(Funcparms.SPECIFICNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSpecificname() {
		return getValue(Funcparms.SPECIFICNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setRowtype(String value) {
		setValue(Funcparms.ROWTYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getRowtype() {
		return getValue(Funcparms.ROWTYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setOrdinal(Short value) {
		setValue(Funcparms.ORDINAL, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getOrdinal() {
		return getValue(Funcparms.ORDINAL);
	}

	/**
	 * An uncommented item
	 */
	public void setParmname(String value) {
		setValue(Funcparms.PARMNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getParmname() {
		return getValue(Funcparms.PARMNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTypeschema(String value) {
		setValue(Funcparms.TYPESCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTypeschema() {
		return getValue(Funcparms.TYPESCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTypename(String value) {
		setValue(Funcparms.TYPENAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTypename() {
		return getValue(Funcparms.TYPENAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLength(Integer value) {
		setValue(Funcparms.LENGTH, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getLength() {
		return getValue(Funcparms.LENGTH);
	}

	/**
	 * An uncommented item
	 */
	public void setScale(Short value) {
		setValue(Funcparms.SCALE, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getScale() {
		return getValue(Funcparms.SCALE);
	}

	/**
	 * An uncommented item
	 */
	public void setCodepage(Short value) {
		setValue(Funcparms.CODEPAGE, value);
	}

	/**
	 * An uncommented item
	 */
	public Short getCodepage() {
		return getValue(Funcparms.CODEPAGE);
	}

	/**
	 * An uncommented item
	 */
	public void setCastFuncid(Integer value) {
		setValue(Funcparms.CAST_FUNCID, value);
	}

	/**
	 * An uncommented item
	 */
	public Integer getCastFuncid() {
		return getValue(Funcparms.CAST_FUNCID);
	}

	/**
	 * An uncommented item
	 */
	public void setAsLocator(String value) {
		setValue(Funcparms.AS_LOCATOR, value);
	}

	/**
	 * An uncommented item
	 */
	public String getAsLocator() {
		return getValue(Funcparms.AS_LOCATOR);
	}

	/**
	 * An uncommented item
	 */
	public void setTargetTypeschema(String value) {
		setValue(Funcparms.TARGET_TYPESCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTargetTypeschema() {
		return getValue(Funcparms.TARGET_TYPESCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTargetTypename(String value) {
		setValue(Funcparms.TARGET_TYPENAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTargetTypename() {
		return getValue(Funcparms.TARGET_TYPENAME);
	}

	/**
	 * An uncommented item
	 */
	public void setScopeTabschema(String value) {
		setValue(Funcparms.SCOPE_TABSCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getScopeTabschema() {
		return getValue(Funcparms.SCOPE_TABSCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setScopeTabname(String value) {
		setValue(Funcparms.SCOPE_TABNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getScopeTabname() {
		return getValue(Funcparms.SCOPE_TABNAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTransformGrpname(String value) {
		setValue(Funcparms.TRANSFORM_GRPNAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTransformGrpname() {
		return getValue(Funcparms.TRANSFORM_GRPNAME);
	}

	public FuncparmsRecord(Configuration configuration) {
		super(configuration, Funcparms.FUNCPARMS);
	}
}
