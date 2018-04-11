package com.autobook.core;

import com.autobook.bean.AutoBookInfo;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public class AutoBookInfoParser extends AbstractParser {

    public AutoBookInfoParser(PatternRegex patternRegex) {
        super(patternRegex);
    }

    @Override
    public AutoBookInfo parse(String source) {
        if (StringUtils.isEmpty(source)) {
            throw new RuntimeException("info empty");
        }

        String[] strs = source.trim().split("\\.");
        AutoBookInfo autoBookInfo = new AutoBookInfo();
        autoBookInfo.setOrderId(strs[1].substring(4, strs[1].length()));
        autoBookInfo.setRequestTime(strs[0]);

        return autoBookInfo;
    }

    @Override
    public List<String> groupContent(String content) {
        return groupContent(content, patternRegex.getAutoBookInfoReg());
    }
}
