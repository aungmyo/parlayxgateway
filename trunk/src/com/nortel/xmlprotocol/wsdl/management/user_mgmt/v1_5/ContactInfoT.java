//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.management.user_mgmt.v1_5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfoT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}ValidContactTypeT"/>
 *         &lt;element name="contactIdentifier" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}nonEmptyString"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="contactName" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}nonEmptyString"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoT", propOrder = {
    "type",
    "contactIdentifier",
    "priority",
    "contactName",
    "pin"
})
public class ContactInfoT {

    @XmlElement(required = true)
    protected ValidContactTypeT type;
    @XmlElement(required = true)
    protected String contactIdentifier;
    protected float priority;
    @XmlElement(required = true)
    protected String contactName;
    @XmlElementRef(name = "pin", type = JAXBElement.class)
    protected JAXBElement<String> pin;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ValidContactTypeT }
     *     
     */
    public ValidContactTypeT getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidContactTypeT }
     *     
     */
    public void setType(ValidContactTypeT value) {
        this.type = value;
    }

    /**
     * Gets the value of the contactIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIdentifier() {
        return contactIdentifier;
    }

    /**
     * Sets the value of the contactIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIdentifier(String value) {
        this.contactIdentifier = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public float getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(float value) {
        this.priority = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPin(JAXBElement<String> value) {
        this.pin = ((JAXBElement<String> ) value);
    }

}