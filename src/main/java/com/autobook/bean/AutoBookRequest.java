package com.autobook.bean;

import com.autobook.annotation.CollectField;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AutoBookRequest")
@CollectField(contextIndex = 1)
public class AutoBookRequest implements Serializable, Comparable<AutoBookRequest> {


    private String sn;
    private String uid;
    @XmlElement(name = "OrderId")
    private String orderId;
    private String orderIdCh;
    private String orderIdInf;
    private String channel;
    @XmlElement(name = "Airline")
    private String airline;
    @XmlElement(name = "TripType")
    private String tripType;
    @XmlElementWrapper(name = "AirSegments")
    @XmlElement(name = "AirSegment")
    private List<AirSegment> airSegments;
    @XmlElementWrapper(name = "Passengers")
    @XmlElement(name = "Passenger")
    private List<Passenger> passengers;
    private Contact contactInfo;
    private int fareCheckType;
    private int childAsAdult;
    @XmlElement(name = "TotalAmount")
    private double totalAmount;
    @XmlElement(name = "Source")
    private String source;
    private Boolean isAsync;
    private Boolean isRebook;

    private AutoBookInfo autoBookInfo;


    public AutoBookInfo getAutoBookInfo() {
        return autoBookInfo;
    }

    public void setAutoBookInfo(AutoBookInfo autoBookInfo) {
        this.autoBookInfo = autoBookInfo;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderIdCh() {
        return orderIdCh;
    }

    public void setOrderIdCh(String orderIdCh) {
        this.orderIdCh = orderIdCh;
    }

    public String getOrderIdInf() {
        return orderIdInf;
    }

    public void setOrderIdInf(String orderIdInf) {
        this.orderIdInf = orderIdInf;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public List<AirSegment> getAirSegments() {
        return airSegments;
    }

    public void setAirSegments(List<AirSegment> airSegments) {
        this.airSegments = airSegments;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getFareCheckType() {
        return fareCheckType;
    }

    public void setFareCheckType(int fareCheckType) {
        this.fareCheckType = fareCheckType;
    }

    public int getChildAsAdult() {
        return childAsAdult;
    }

    public void setChildAsAdult(int childAsAdult) {
        this.childAsAdult = childAsAdult;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getAsync() {
        return isAsync;
    }

    public void setAsync(Boolean async) {
        isAsync = async;
    }

    public Boolean getRebook() {
        return isRebook;
    }

    public void setRebook(Boolean rebook) {
        isRebook = rebook;
    }


    @Override
    public int compareTo(AutoBookRequest o) {

        // return this.getPassengers().get(0).getCredentialsNo().compareTo(o.getPassengers().get(0).getCredentialsNo());
        return this.getAirSegments().get(0).getFlightNo().compareTo(o.getAirSegments().get(0).getFlightNo());
    }
}
