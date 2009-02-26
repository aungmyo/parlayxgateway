//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.presence.notification.v3_2.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.csapi.schema.parlayx.presence.v3_2.PresenceAttribute;


/**
 * <p>Java class for statusChanged complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusChanged">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="presentity" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="changedAttributes" type="{http://www.csapi.org/schema/parlayx/presence/v3_2}PresenceAttribute" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusChanged", propOrder = {
    "correlator",
    "presentity",
    "changedAttributes"
})
public class StatusChanged {

    @XmlElement(required = true)
    protected String correlator;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String presentity;
    @XmlElement(required = true)
    protected List<PresenceAttribute> changedAttributes;

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
     * Gets the value of the changedAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresenceAttribute }
     * 
     * 
     */
    public List<PresenceAttribute> getChangedAttributes() {
        if (changedAttributes == null) {
            changedAttributes = new ArrayList<PresenceAttribute>();
        }
        return this.changedAttributes;
    }

}
