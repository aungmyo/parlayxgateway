//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.terminal_location.v3_1.local;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.csapi.schema.parlayx.common.v3_1.TimeMetric;
import org.csapi.schema.parlayx.terminal_location.v3_0.DelayTolerance;


/**
 * <p>Java class for getLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requester" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="requestedAccuracy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="acceptableAccuracy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maximumAge" type="{http://www.csapi.org/schema/parlayx/common/v3_1}TimeMetric" minOccurs="0"/>
 *         &lt;element name="responseTime" type="{http://www.csapi.org/schema/parlayx/common/v3_1}TimeMetric" minOccurs="0"/>
 *         &lt;element name="tolerance" type="{http://www.csapi.org/schema/parlayx/terminal_location/v3_0}DelayTolerance"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLocation", propOrder = {
    "requester",
    "address",
    "requestedAccuracy",
    "acceptableAccuracy",
    "maximumAge",
    "responseTime",
    "tolerance"
})
public class GetLocation {

    @XmlSchemaType(name = "anyURI")
    protected String requester;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;
    protected int requestedAccuracy;
    protected int acceptableAccuracy;
    protected TimeMetric maximumAge;
    protected TimeMetric responseTime;
    @XmlElement(required = true)
    protected DelayTolerance tolerance;

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequester(String value) {
        this.requester = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the requestedAccuracy property.
     * 
     */
    public int getRequestedAccuracy() {
        return requestedAccuracy;
    }

    /**
     * Sets the value of the requestedAccuracy property.
     * 
     */
    public void setRequestedAccuracy(int value) {
        this.requestedAccuracy = value;
    }

    /**
     * Gets the value of the acceptableAccuracy property.
     * 
     */
    public int getAcceptableAccuracy() {
        return acceptableAccuracy;
    }

    /**
     * Sets the value of the acceptableAccuracy property.
     * 
     */
    public void setAcceptableAccuracy(int value) {
        this.acceptableAccuracy = value;
    }

    /**
     * Gets the value of the maximumAge property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMetric }
     *     
     */
    public TimeMetric getMaximumAge() {
        return maximumAge;
    }

    /**
     * Sets the value of the maximumAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMetric }
     *     
     */
    public void setMaximumAge(TimeMetric value) {
        this.maximumAge = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeMetric }
     *     
     */
    public TimeMetric getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMetric }
     *     
     */
    public void setResponseTime(TimeMetric value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link DelayTolerance }
     *     
     */
    public DelayTolerance getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayTolerance }
     *     
     */
    public void setTolerance(DelayTolerance value) {
        this.tolerance = value;
    }

}