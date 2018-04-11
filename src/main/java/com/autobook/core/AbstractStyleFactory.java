package com.autobook.core;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public abstract class AbstractStyleFactory {


    public Style defualtStyle() {
        return new DefualtStyle();
    }

    public abstract Style createStyle(final String style);


    class DefualtStyle implements Style {

        private static final String DEFUALT_STYLE =
                "orderId | flightNo | dcity | acity | cabin | requestTime |credentialsNo | effectDate ";

        private static final String SEPARATOR = " | ";

        @Override
        public String getPrintFormat() {
            return DEFUALT_STYLE;
        }

        @Override
        public String getSeparator() {
            return SEPARATOR;
        }

        @Override
        public String countField() {
            return "flightNo";
        }
    }


}
