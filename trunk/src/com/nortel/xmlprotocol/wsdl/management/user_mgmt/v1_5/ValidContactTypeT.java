//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.management.user_mgmt.v1_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidContactTypeT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValidContactTypeT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="Chat"/>
 *     &lt;enumeration value="Sms"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Mms"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="MeansOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValidContactTypeT")
@XmlEnum
public enum ValidContactTypeT {

    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Chat")
    CHAT("Chat"),
    @XmlEnumValue("Sms")
    SMS("Sms"),
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Mms")
    MMS("Mms"),
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),
    @XmlEnumValue("MeansOther")
    MEANS_OTHER("MeansOther");
    private final String value;

    ValidContactTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValidContactTypeT fromValue(String v) {
        for (ValidContactTypeT c: ValidContactTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}