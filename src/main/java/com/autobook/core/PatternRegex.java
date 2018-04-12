package com.autobook.core;

import com.autobook.config.Configuration;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public class PatternRegex {

    private static final String DEFUALT_AUTOBOOK_REQUEST_REG = Configuration.valueOf("defualt.autobook.request.reg");
    private static final String DEFUALT_AUTOBOOK_INFO_REG = Configuration.valueOf("defualt.autobook.info.reg");


    private String autoBookRequestReg;

    private String autoBookInfoReg;


    public PatternRegex() {
        this.autoBookRequestReg = DEFUALT_AUTOBOOK_REQUEST_REG;
        this.autoBookInfoReg = DEFUALT_AUTOBOOK_INFO_REG;
    }

    public PatternRegex(String autoBookRequestReg, String autoBookInfoReg) {
        this.autoBookRequestReg = autoBookRequestReg;
        this.autoBookInfoReg = autoBookInfoReg;
    }

    public String getAutoBookRequestReg() {
        return autoBookRequestReg;
    }

    public void setAutoBookRequestReg(String autoBookRequestReg) {
        this.autoBookRequestReg = autoBookRequestReg;
    }

    public String getAutoBookInfoReg() {
        return autoBookInfoReg;
    }

    public void setAutoBookInfoReg(String autoBookInfoReg) {
        this.autoBookInfoReg = autoBookInfoReg;
    }
}
