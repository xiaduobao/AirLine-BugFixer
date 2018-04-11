package com.autobook.core;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public class PatternRegex {

    private static final String DEFUALT_AUTOBOOK_REQUEST_REG = "<AutoBookRequest>[\\s\\S]*?</AutoBookRequest>";

    private static final String DEFUALT_AUTOBOOK_INFO_REG = "\\d{4}(-\\d{2}){2} (\\d{2}:){2}\\d{2}\\.\\d{3} \\d{10}";


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
