package com.autobook.core;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class DefualtStyleFactory extends AbstractStyleFactory {
    @Override
    public Style createStyle(String style) {
        return this.defualtStyle();
    }


}
