package com.autobook.bean;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class IntlFare {

    // 价格
    private double amount;

    // 运价类型
    private String fareType;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFareType() {
        return fareType;
    }

    public void setFareType(String fareType) {
        this.fareType = fareType;
    }
}
