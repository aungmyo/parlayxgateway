//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.third_party_call.v2_3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CallInitial"/>
 *     &lt;enumeration value="CallConnected"/>
 *     &lt;enumeration value="CallTerminated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallStatus")
@XmlEnum
public enum CallStatus {

    @XmlEnumValue("CallInitial")
    CALL_INITIAL("CallInitial"),
    @XmlEnumValue("CallConnected")
    CALL_CONNECTED("CallConnected"),
    @XmlEnumValue("CallTerminated")
    CALL_TERMINATED("CallTerminated");
    private final String value;

    CallStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallStatus fromValue(String v) {
        for (CallStatus c: CallStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
