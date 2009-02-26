//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.call_notification.v3_8.local;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notifyCalledNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notifyCalledNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callingParticipant" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="callingParticipantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calledParticipant" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="callSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifyCalledNumber", propOrder = {
    "correlator",
    "callingParticipant",
    "callingParticipantName",
    "calledParticipant",
    "callSessionIdentifier"
})
public class NotifyCalledNumber {

    @XmlElement(required = true)
    protected String correlator;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String callingParticipant;
    protected String callingParticipantName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String calledParticipant;
    protected String callSessionIdentifier;

    /**
     * Gets the value of the correlator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelator() {
        return correlator;
    }

    /**
     * Sets the value of the correlator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelator(String value) {
        this.correlator = value;
    }

    /**
     * Gets the value of the callingParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingParticipant() {
        return callingParticipant;
    }

    /**
     * Sets the value of the callingParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingParticipant(String value) {
        this.callingParticipant = value;
    }

    /**
     * Gets the value of the callingParticipantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingParticipantName() {
        return callingParticipantName;
    }

    /**
     * Sets the value of the callingParticipantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingParticipantName(String value) {
        this.callingParticipantName = value;
    }

    /**
     * Gets the value of the calledParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledParticipant() {
        return calledParticipant;
    }

    /**
     * Sets the value of the calledParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledParticipant(String value) {
        this.calledParticipant = value;
    }

    /**
     * Gets the value of the callSessionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallSessionIdentifier() {
        return callSessionIdentifier;
    }

    /**
     * Sets the value of the callSessionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallSessionIdentifier(String value) {
        this.callSessionIdentifier = value;
    }

}
