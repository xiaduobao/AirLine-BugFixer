package com.autobook.core;

import com.autobook.config.Configuration;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public abstract class AbstractStyleFactory {


    public Style defualtStyle() {
        return new DefualtStyle();
    }

    public abstract Style createStyle(final String style);


    class DefualtStyle implements Style {

        private  final String DEFUALT_STYLE = Configuration.valueOf("defualt.print.style");

        private  final String SEPARATOR = Configuration.valueOf("defualt.separator");

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
