//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.location.services.location_supplier.v1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationTechnologyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationTechnologyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SATELLITE"/>
 *     &lt;enumeration value="SHORTRANGE"/>
 *     &lt;enumeration value="CELLULAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationTechnologyType")
@XmlEnum
public enum LocationTechnologyType {

    SATELLITE,
    SHORTRANGE,
    CELLULAR;

    public String value() {
        return name();
    }

    public static LocationTechnologyType fromValue(String v) {
        return valueOf(v);
    }

}