package com.autobook.core;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public abstract class AbstractParser implements Parser {

    protected PatternRegex patternRegex;

    public AbstractParser(PatternRegex patternRegex) {
        this.patternRegex = patternRegex;
    }

    public List<String> groupContent(String content, String reg) {
        if (StringUtils.isEmpty(content) || StringUtils.isEmpty(reg)) {
            throw new RuntimeException("params Can't be empty");
        }
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(content);
        List<String> contents = new ArrayList<>();
        while (matcher.find()) {
            contents.add(matcher.group());
        }
        return contents;
    }

    public PatternRegex getPatternRegex() {
        return patternRegex;
    }

    public void setPatternRegex(PatternRegex patternRegex) {
        this.patternRegex = patternRegex;
    }
}
