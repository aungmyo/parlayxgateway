//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.call_notification.notification_manager.v3_1.local;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.csapi.schema.parlayx.common.v3_1.SimpleReference;


/**
 * <p>Java class for startPlayAndCollectNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startPlayAndCollectNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reference" type="{http://www.csapi.org/schema/parlayx/common/v3_1}SimpleReference"/>
 *         &lt;element name="callSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startPlayAndCollectNotification", propOrder = {
    "reference",
    "callSessionIdentifier"
})
public class StartPlayAndCollectNotification {

    @XmlElement(required = true)
    protected SimpleReference reference;
    @XmlElement(required = true)
    protected String callSessionIdentifier;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleReference }
     *     
     */
    public SimpleReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleReference }
     *     
     */
    public void setReference(SimpleReference value) {
        this.reference = value;
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
