package com.autobook.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jiabaowang on 2018/4/10.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Passenger")
public class Passenger {


    // 旅客姓名
    @XmlElement(name = "PassengerName")
    private String passengerName;
    // 称谓
    private String title;

    // 旅客类型
    // 0:成人，1:儿童，2:婴儿
    @XmlElement(name = "PassengerType")
    private int passengerType = 0;

    // 国籍

    private String nationality;

    // 性别

    private String gender;

    // 身份证件类型
    @XmlElement(name = "IdType")
    private String idType;

    // 证件号
    @XmlElement(name = "IdNo")
    private String idNo;

    // 常客卡类型
    @XmlElement(name = "CardType")
    private String cardType;

    // 常客卡号码
    @XmlElement(name = "CardNo")
    private String cardNo;

    // 身份证件类型
    @XmlElement(name = "CredentialsType")
    private String credentialsType;

    // 证件号
    @XmlElement(name = "CredentialsNo")
    private String credentialsNo;

    // 证件签发地

    private String credentialsIssuedBy;

    // 证件有效期

    private String credentialsExpdate;

    // 常客卡类型

    private String frequentCardType;

    // 常客卡号码

    private String frequentCardNo;

    // 出生年月日(儿童和婴儿必须填写)
    @XmlElement(name = "Birthday")
    private String birthday;

    // X产品信息

    // private List<XprodBookInfo> _xprodInfos;

    // 乘机人手机号
    private String mobliePhone;

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(int passengerType) {
        this.passengerType = passengerType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(String credentialsType) {
        this.credentialsType = credentialsType;
    }

    public String getCredentialsNo() {
        return credentialsNo;
    }

    public void setCredentialsNo(String credentialsNo) {
        this.credentialsNo = credentialsNo;
    }

    public String getCredentialsIssuedBy() {
        return credentialsIssuedBy;
    }

    public void setCredentialsIssuedBy(String credentialsIssuedBy) {
        this.credentialsIssuedBy = credentialsIssuedBy;
    }

    public String getCredentialsExpdate() {
        return credentialsExpdate;
    }

    public void setCredentialsExpdate(String credentialsExpdate) {
        this.credentialsExpdate = credentialsExpdate;
    }

    public String getFrequentCardType() {
        return frequentCardType;
    }

    public void setFrequentCardType(String frequentCardType) {
        this.frequentCardType = frequentCardType;
    }

    public String getFrequentCardNo() {
        return frequentCardNo;
    }

    public void setFrequentCardNo(String frequentCardNo) {
        this.frequentCardNo = frequentCardNo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMobliePhone() {
        return mobliePhone;
    }

    public void setMobliePhone(String mobliePhone) {
        this.mobliePhone = mobliePhone;
    }
}


