//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.communications.multimedia_conference.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageType" type="{http://www.nortel.com/xmlprotocol/wsdl/communications/multimedia_conference/v1_0/}messageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessage", propOrder = {
    "callSessionIdentifier",
    "messageType"
})
public class GetMessage {

    @XmlElement(required = true)
    protected String callSessionIdentifier;
    @XmlElement(required = true)
    protected MessageType messageType;

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

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessageType(MessageType value) {
        this.messageType = value;
    }

}
