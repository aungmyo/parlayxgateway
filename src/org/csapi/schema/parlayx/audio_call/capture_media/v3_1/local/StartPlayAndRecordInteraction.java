//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.26 at 11:20:45 ���� CST 
//


package org.csapi.schema.parlayx.audio_call.capture_media.v3_1.local;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.csapi.schema.parlayx.audio_call.v3_2.PlayConfig;
import org.csapi.schema.parlayx.audio_call.v3_2.RecConfig;


/**
 * <p>Java class for startPlayAndRecordInteraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="startPlayAndRecordInteraction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="callParticipant" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="playingConfiguration" type="{http://www.csapi.org/schema/parlayx/audio_call/v3_2}PlayConfig"/>
 *         &lt;element name="recordingConfiguration" type="{http://www.csapi.org/schema/parlayx/audio_call/v3_2}RecConfig"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startPlayAndRecordInteraction", propOrder = {
    "callSessionIdentifier",
    "callParticipant",
    "playingConfiguration",
    "recordingConfiguration"
})
public class StartPlayAndRecordInteraction {

    @XmlElement(required = true)
    protected String callSessionIdentifier;
    @XmlSchemaType(name = "anyURI")
    protected String callParticipant;
    @XmlElement(required = true)
    protected PlayConfig playingConfiguration;
    @XmlElement(required = true)
    protected RecConfig recordingConfiguration;

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
     * Gets the value of the callParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallParticipant() {
        return callParticipant;
    }

    /**
     * Sets the value of the callParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallParticipant(String value) {
        this.callParticipant = value;
    }

    /**
     * Gets the value of the playingConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link PlayConfig }
     *     
     */
    public PlayConfig getPlayingConfiguration() {
        return playingConfiguration;
    }

    /**
     * Sets the value of the playingConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayConfig }
     *     
     */
    public void setPlayingConfiguration(PlayConfig value) {
        this.playingConfiguration = value;
    }

    /**
     * Gets the value of the recordingConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link RecConfig }
     *     
     */
    public RecConfig getRecordingConfiguration() {
        return recordingConfiguration;
    }

    /**
     * Sets the value of the recordingConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecConfig }
     *     
     */
    public void setRecordingConfiguration(RecConfig value) {
        this.recordingConfiguration = value;
    }

}
