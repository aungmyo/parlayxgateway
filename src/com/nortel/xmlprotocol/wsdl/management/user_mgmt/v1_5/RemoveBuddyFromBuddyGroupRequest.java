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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}nonEmptyString"/>
 *         &lt;element name="buddyGroupName" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}nonEmptyString"/>
 *         &lt;element name="buddyNames" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}BuddyNamesT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "buddyGroupName",
    "buddyNames"
})
@XmlRootElement(name = "removeBuddyFromBuddyGroupRequest")
public class RemoveBuddyFromBuddyGroupRequest {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String buddyGroupName;
    @XmlElement(required = true)
    protected BuddyNamesT buddyNames;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

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
     * Gets the value of the buddyNames property.
     * 
     * @return
     *     possible object is
     *     {@link BuddyNamesT }
     *     
     */
    public BuddyNamesT getBuddyNames() {
        return buddyNames;
    }

    /**
     * Sets the value of the buddyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuddyNamesT }
     *     
     */
    public void setBuddyNames(BuddyNamesT value) {
        this.buddyNames = value;
    }

}
