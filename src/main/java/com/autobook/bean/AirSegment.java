package com.autobook.bean;

import com.autobook.annotation.CollectField;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AirSegment")
@CollectField(contextIndex = 2)
public class AirSegment {


    // 行程编号（去程[含中转]为0，回程[含中转]为1）国际用
    private int tripSection = 0;

    // 出发城市
    @XmlElement(name = "Dcity")
    private String dcity;

    // 到达城市
    @XmlElement(name = "Acity")
    private String acity;

    // 出发机场
    @XmlElement(name = "Dport")
    private String dport;

    // 到达机场
    @XmlElement(name = "Aport")
    private String aport;


    // 航班
    @XmlElement(name = "FlightNo")
    private String flightNo;


    // 起飞日期
    @XmlElement(name = "Effectdate")
    private String effectDate;

    // 舱位
    @XmlElement(name = "Cabin")
    private String cabin;

    // 儿童舱位
    @XmlElement(name = "Cabinch")
    private String cabinch;

    // 婴儿舱位
    @XmlElement(name = "Cabininf")
    private String cabininf;

    // 可用的舱位序列
    @XmlElement(name = "Availcabins")
    private String availcabins;

    // 产品类型（只在AirLine方式HU有效）
    @XmlElement(name = "AgreementId")
    private String agreementId;

    // 票价（不含机建燃油费）
    @XmlElement(name = "Price")
    private double price;

    // 起飞时间（年月日时分，川航必需）
    @XmlElement(name = "TakeoffTime")
    private Date takeoffTime = new Date();

    // 到达时间（年月日时分，川航必需）
    @XmlElement(name = "ArrivalTime")
    private Date arrivalTime = new Date();

    // 机场建设费（必需）
    @XmlElement(name = "AirTax")
    private double airTax = 0.0;

    // 燃油附加费（必需）
    @XmlElement(name = "AddFee")
    private double addFee = 0.0;

    // 成人运价信息（必需）
    @XmlElement(name = "Adultfare")
    private Fare adultfare = new Fare();

    // 儿童运价信息
    @XmlElement(name = "Childfare")
    private Fare childfare = new Fare();

    // 婴儿运价信息
    @XmlElement(name = "Infantfare")
    private Fare infantfare = new Fare();


    // 保险产品信息

    private List<InsuranceProductInfo> insuranceProductInfo = null;

    // 是否刷新舱位信息

    private Boolean isRefreshCabin = false;

    public int getTripSection() {
        return tripSection;
    }

    public void setTripSection(int tripSection) {
        this.tripSection = tripSection;
    }

    public String getDcity() {
        return dcity;
    }

    public void setDcity(String dcity) {
        this.dcity = dcity;
    }

    public String getAcity() {
        return acity;
    }

    public void setAcity(String acity) {
        this.acity = acity;
    }

    public String getDport() {
        return dport;
    }

    public void setDport(String dport) {
        this.dport = dport;
    }

    public String getAport() {
        return aport;
    }

    public void setAport(String aport) {
        this.aport = aport;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getCabinch() {
        return cabinch;
    }

    public void setCabinch(String cabinch) {
        this.cabinch = cabinch;
    }

    public String getCabininf() {
        return cabininf;
    }

    public void setCabininf(String cabininf) {
        this.cabininf = cabininf;
    }

    public String getAvailcabins() {
        return availcabins;
    }

    public void setAvailcabins(String availcabins) {
        this.availcabins = availcabins;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getTakeoffTime() {
        return takeoffTime;
    }

    public void setTakeoffTime(Date takeoffTime) {
        this.takeoffTime = takeoffTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getAirTax() {
        return airTax;
    }

    public void setAirTax(double airTax) {
        this.airTax = airTax;
    }

    public double getAddFee() {
        return addFee;
    }

    public void setAddFee(double addFee) {
        this.addFee = addFee;
    }

    public Fare getAdultfare() {
        return adultfare;
    }

    public void setAdultfare(Fare adultfare) {
        this.adultfare = adultfare;
    }

    public Fare getChildfare() {
        return childfare;
    }

    public void setChildfare(Fare childfare) {
        this.childfare = childfare;
    }

    public Fare getInfantfare() {
        return infantfare;
    }

    public void setInfantfare(Fare infantfare) {
        this.infantfare = infantfare;
    }

    public List<InsuranceProductInfo> getInsuranceProductInfo() {
        return insuranceProductInfo;
    }

    public void setInsuranceProductInfo(List<InsuranceProductInfo> insuranceProductInfo) {
        this.insuranceProductInfo = insuranceProductInfo;
    }

    public Boolean getRefreshCabin() {
        return isRefreshCabin;
    }

    public void setRefreshCabin(Boolean refreshCabin) {
        isRefreshCabin = refreshCabin;
    }
}
