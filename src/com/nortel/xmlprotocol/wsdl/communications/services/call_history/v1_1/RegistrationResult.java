//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.communications.services.call_history.v1_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data structure for the response for an address registration action
 * 
 * <p>Java class for RegistrationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="failureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationResult", propOrder = {
    "address",
    "success",
    "failureReason"
})
public class RegistrationResult {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;
    protected boolean success;
    protected String failureReason;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the failureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * Sets the value of the failureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReason(String value) {
        this.failureReason = value;
    }

}
