//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.communications.services.ipc.v1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makeCallRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makeCallRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trid" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="calledParty" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="handset" type="{http://www.nortel.com/xmlprotocol/wsdl/communications/services/ipc/v1_0/}handset" minOccurs="0"/>
 *         &lt;element name="huntgroup" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makeCallRequestType", propOrder = {
    "trid",
    "calledParty",
    "handset",
    "huntgroup"
})
public class MakeCallRequestType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String trid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String calledParty;
    protected Handset handset;
    protected BigInteger huntgroup;

    /**
     * Gets the value of the trid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrid() {
        return trid;
    }

    /**
     * Sets the value of the trid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrid(String value) {
        this.trid = value;
    }

    /**
     * Gets the value of the calledParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledParty() {
        return calledParty;
    }

    /**
     * Sets the value of the calledParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledParty(String value) {
        this.calledParty = value;
    }

    /**
     * Gets the value of the handset property.
     * 
     * @return
     *     possible object is
     *     {@link Handset }
     *     
     */
    public Handset getHandset() {
        return handset;
    }

    /**
     * Sets the value of the handset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Handset }
     *     
     */
    public void setHandset(Handset value) {
        this.handset = value;
    }

    /**
     * Gets the value of the huntgroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHuntgroup() {
        return huntgroup;
    }

    /**
     * Sets the value of the huntgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHuntgroup(BigInteger value) {
        this.huntgroup = value;
    }

}
