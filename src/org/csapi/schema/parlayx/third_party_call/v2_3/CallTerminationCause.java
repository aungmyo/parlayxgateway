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
 * <p>Java class for CallTerminationCause.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CallTerminationCause">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CallingPartyNoAnswer"/>
 *     &lt;enumeration value="CalledPartyNoAnswer"/>
 *     &lt;enumeration value="CallingPartyBusy"/>
 *     &lt;enumeration value="CalledPartyBusy"/>
 *     &lt;enumeration value="CallingPartyNotReachable"/>
 *     &lt;enumeration value="CalledPartyNotReachable"/>
 *     &lt;enumeration value="CallHangUp"/>
 *     &lt;enumeration value="CallAborted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallTerminationCause")
@XmlEnum
public enum CallTerminationCause {

    @XmlEnumValue("CallingPartyNoAnswer")
    CALLING_PARTY_NO_ANSWER("CallingPartyNoAnswer"),
    @XmlEnumValue("CalledPartyNoAnswer")
    CALLED_PARTY_NO_ANSWER("CalledPartyNoAnswer"),
    @XmlEnumValue("CallingPartyBusy")
    CALLING_PARTY_BUSY("CallingPartyBusy"),
    @XmlEnumValue("CalledPartyBusy")
    CALLED_PARTY_BUSY("CalledPartyBusy"),
    @XmlEnumValue("CallingPartyNotReachable")
    CALLING_PARTY_NOT_REACHABLE("CallingPartyNotReachable"),
    @XmlEnumValue("CalledPartyNotReachable")
    CALLED_PARTY_NOT_REACHABLE("CalledPartyNotReachable"),
    @XmlEnumValue("CallHangUp")
    CALL_HANG_UP("CallHangUp"),
    @XmlEnumValue("CallAborted")
    CALL_ABORTED("CallAborted");
    private final String value;

    CallTerminationCause(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallTerminationCause fromValue(String v) {
        for (CallTerminationCause c: CallTerminationCause.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
