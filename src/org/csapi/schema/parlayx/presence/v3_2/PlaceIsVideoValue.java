//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.presence.v3_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceIsVideoValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlaceIsVideoValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TooBright"/>
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="Dark"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlaceIsVideoValue")
@XmlEnum
public enum PlaceIsVideoValue {

    @XmlEnumValue("TooBright")
    TOO_BRIGHT("TooBright"),
    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Dark")
    DARK("Dark"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    PlaceIsVideoValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceIsVideoValue fromValue(String v) {
        for (PlaceIsVideoValue c: PlaceIsVideoValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
