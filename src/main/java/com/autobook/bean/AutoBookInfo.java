package com.autobook.bean;

import com.autobook.annotation.CollectField;

/**
 * Created by jiabaowang on 2018/4/11.
 */
@CollectField(contextIndex = 4)
public class AutoBookInfo {

    private String requestTime;

    private String orderId;

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
