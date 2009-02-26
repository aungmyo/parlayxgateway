//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.presence.supplier.v3_2.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.csapi.schema.parlayx.presence.v3_2.PresencePermission;


/**
 * <p>Java class for updateSubscriptionAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateSubscriptionAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="presentity" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="watchers" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="decisions" type="{http://www.csapi.org/schema/parlayx/presence/v3_2}PresencePermission" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="politeBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateSubscriptionAuthorization", propOrder = {
    "presentity",
    "watchers",
    "decisions",
    "politeBlocked"
})
public class UpdateSubscriptionAuthorization {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String presentity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> watchers;
    protected List<PresencePermission> decisions;
    protected boolean politeBlocked;

    /**
     * Gets the value of the presentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentity() {
        return presentity;
    }

    /**
     * Sets the value of the presentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentity(String value) {
        this.presentity = value;
    }

    /**
     * Gets the value of the watchers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watchers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatchers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWatchers() {
        if (watchers == null) {
            watchers = new ArrayList<String>();
        }
        return this.watchers;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresencePermission }
     * 
     * 
     */
    public List<PresencePermission> getDecisions() {
        if (decisions == null) {
            decisions = new ArrayList<PresencePermission>();
        }
        return this.decisions;
    }

    /**
     * Gets the value of the politeBlocked property.
     * 
     */
    public boolean isPoliteBlocked() {
        return politeBlocked;
    }

    /**
     * Sets the value of the politeBlocked property.
     * 
     */
    public void setPoliteBlocked(boolean value) {
        this.politeBlocked = value;
    }

}
