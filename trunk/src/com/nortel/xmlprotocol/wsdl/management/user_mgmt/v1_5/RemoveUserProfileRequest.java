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
 *         &lt;element name="userNames" type="{http://www.nortel.com/xmlprotocol/wsdl/management/user_mgmt/v1_5/}UserNamesT"/>
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
    "userNames"
})
@XmlRootElement(name = "removeUserProfileRequest")
public class RemoveUserProfileRequest {

    @XmlElement(required = true)
    protected UserNamesT userNames;

    /**
     * Gets the value of the userNames property.
     * 
     * @return
     *     possible object is
     *     {@link UserNamesT }
     *     
     */
    public UserNamesT getUserNames() {
        return userNames;
    }

    /**
     * Sets the value of the userNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserNamesT }
     *     
     */
    public void setUserNames(UserNamesT value) {
        this.userNames = value;
    }

}
