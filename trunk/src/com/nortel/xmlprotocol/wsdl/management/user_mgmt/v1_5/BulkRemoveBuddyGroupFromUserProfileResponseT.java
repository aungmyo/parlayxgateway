//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package com.nortel.xmlprotocol.wsdl.management.user_mgmt.v1_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BulkRemoveBuddyGroupFromUserProfileResponseT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkRemoveBuddyGroupFromUserProfileResponseT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buddyGroupName" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}nonEmptyString"/>
 *         &lt;element name="status" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}ValidResponseStatusT"/>
 *         &lt;element name="reason" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}nonEmptyString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkRemoveBuddyGroupFromUserProfileResponseT", propOrder = {
    "buddyGroupName",
    "status",
    "reason"
})
public class BulkRemoveBuddyGroupFromUserProfileResponseT {

    @XmlElement(required = true)
    protected String buddyGroupName;
    @XmlElement(required = true)
    protected ValidResponseStatusT status;
    protected String reason;

    /**
     * Gets the value of the buddyGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuddyGroupName() {
        return buddyGroupName;
    }

    /**
     * Sets the value of the buddyGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuddyGroupName(String value) {
        this.buddyGroupName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ValidResponseStatusT }
     *     
     */
    public ValidResponseStatusT getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidResponseStatusT }
     *     
     */
    public void setStatus(ValidResponseStatusT value) {
        this.status = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
