//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.terminal_location.v3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrievalStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrievalStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Retrieved"/>
 *     &lt;enumeration value="NotRetrieved"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RetrievalStatus")
@XmlEnum
public enum RetrievalStatus {

    @XmlEnumValue("Retrieved")
    RETRIEVED("Retrieved"),
    @XmlEnumValue("NotRetrieved")
    NOT_RETRIEVED("NotRetrieved"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    RetrievalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetrievalStatus fromValue(String v) {
        for (RetrievalStatus c: RetrievalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}