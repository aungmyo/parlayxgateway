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
 * <p>Java class for BuddyGroupT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuddyGroupT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupName" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}nonEmptyString"/>
 *         &lt;element name="buddies" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}BuddiesT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuddyGroupT", propOrder = {
    "groupName",
    "buddies"
})
public class BuddyGroupT {

    @XmlElement(required = true)
    protected String groupName;
    protected BuddiesT buddies;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the buddies property.
     * 
     * @return
     *     possible object is
     *     {@link BuddiesT }
     *     
     */
    public BuddiesT getBuddies() {
        return buddies;
    }

    /**
     * Sets the value of the buddies property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuddiesT }
     *     
     */
    public void setBuddies(BuddiesT value) {
        this.buddies = value;
    }

}