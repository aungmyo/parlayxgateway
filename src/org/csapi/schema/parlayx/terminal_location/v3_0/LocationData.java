//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.terminal_location.v3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.csapi.schema.parlayx.common.v3_1.ServiceError;


/**
 * <p>Java class for LocationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="reportStatus" type="{http://www.csapi.org/schema/parlayx/terminal_location/v3_0}RetrievalStatus"/>
 *         &lt;element name="currentLocation" type="{http://www.csapi.org/schema/parlayx/terminal_location/v3_0}LocationInfo" minOccurs="0"/>
 *         &lt;element name="errorInformation" type="{http://www.csapi.org/schema/parlayx/common/v3_1}ServiceError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationData", propOrder = {
    "address",
    "reportStatus",
    "currentLocation",
    "errorInformation"
})
public class LocationData {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(required = true)
    protected RetrievalStatus reportStatus;
    protected LocationInfo currentLocation;
    protected ServiceError errorInformation;

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
     * Gets the value of the reportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalStatus }
     *     
     */
    public RetrievalStatus getReportStatus() {
        return reportStatus;
    }

    /**
     * Sets the value of the reportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalStatus }
     *     
     */
    public void setReportStatus(RetrievalStatus value) {
        this.reportStatus = value;
    }

    /**
     * Gets the value of the currentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfo }
     *     
     */
    public LocationInfo getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the value of the currentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfo }
     *     
     */
    public void setCurrentLocation(LocationInfo value) {
        this.currentLocation = value;
    }

    /**
     * Gets the value of the errorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceError }
     *     
     */
    public ServiceError getErrorInformation() {
        return errorInformation;
    }

    /**
     * Sets the value of the errorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceError }
     *     
     */
    public void setErrorInformation(ServiceError value) {
        this.errorInformation = value;
    }

}