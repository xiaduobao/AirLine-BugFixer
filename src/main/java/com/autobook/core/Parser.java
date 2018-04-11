package com.autobook.core;

import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public interface Parser<T> {
    T parse(String source) throws JAXBException;


    List<String> groupContent(String content);

}
