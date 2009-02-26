//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.audio_call.play_media.v3_2.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.csapi.schema.parlayx.common.v3_1.ChargingInformation;


/**
 * <p>Java class for playAudioMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playAudioMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callParticipants" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audioUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="charging" type="{http://www.csapi.org/schema/parlayx/common/v3_1}ChargingInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playAudioMessage", propOrder = {
    "callSessionIdentifier",
    "callParticipants",
    "audioUrl",
    "charging"
})
public class PlayAudioMessage {

    @XmlElement(required = true)
    protected String callSessionIdentifier;
    @XmlSchemaType(name = "anyURI")
    protected List<String> callParticipants;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String audioUrl;
    protected ChargingInformation charging;

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

    /**
     * Gets the value of the callParticipants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callParticipants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCallParticipants() {
        if (callParticipants == null) {
            callParticipants = new ArrayList<String>();
        }
        return this.callParticipants;
    }

    /**
     * Gets the value of the audioUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioUrl() {
        return audioUrl;
    }

    /**
     * Sets the value of the audioUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioUrl(String value) {
        this.audioUrl = value;
    }

    /**
     * Gets the value of the charging property.
     * 
     * @return
     *     possible object is
     *     {@link ChargingInformation }
     *     
     */
    public ChargingInformation getCharging() {
        return charging;
    }

    /**
     * Sets the value of the charging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingInformation }
     *     
     */
    public void setCharging(ChargingInformation value) {
        this.charging = value;
    }

}
