//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.audio_call.v2_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Played"/>
 *     &lt;enumeration value="Playing"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageStatus", namespace = "http://www.csapi.org/schema/parlayx/audio_call/v2_1")
@XmlEnum
public enum MessageStatus {

    @XmlEnumValue("Played")
    PLAYED("Played"),
    @XmlEnumValue("Playing")
    PLAYING("Playing"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    MessageStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageStatus fromValue(String v) {
        for (MessageStatus c: MessageStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
