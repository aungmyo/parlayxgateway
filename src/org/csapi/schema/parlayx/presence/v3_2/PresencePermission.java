//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.presence.v3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PresencePermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresencePermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="presenceAttribute" type="{http://www.csapi.org/schema/parlayx/presence/v3_2}PresenceAttributeType"/>
 *         &lt;element name="decision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresencePermission", propOrder = {
    "presenceAttribute",
    "decision"
})
public class PresencePermission {

    @XmlElement(required = true)
    protected PresenceAttributeType presenceAttribute;
    protected boolean decision;

    /**
     * Gets the value of the presenceAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link PresenceAttributeType }
     *     
     */
    public PresenceAttributeType getPresenceAttribute() {
        return presenceAttribute;
    }

    /**
     * Sets the value of the presenceAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresenceAttributeType }
     *     
     */
    public void setPresenceAttribute(PresenceAttributeType value) {
        this.presenceAttribute = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     */
    public boolean isDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     */
    public void setDecision(boolean value) {
        this.decision = value;
    }

}
