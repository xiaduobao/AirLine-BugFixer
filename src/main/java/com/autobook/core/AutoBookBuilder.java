package com.autobook.core;

import com.autobook.bean.AutoBookInfo;
import com.autobook.bean.AutoBookRequest;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class AutoBookBuilder extends AbstractBuilder{

    private AutoBookRequestParser autoBookParser;

    private AutoBookInfoParser autoBookInfoParser;

    public AutoBookBuilder(PatternRegex patternRegex) {
        autoBookParser = new AutoBookRequestParser(patternRegex);
        autoBookInfoParser = new AutoBookInfoParser(patternRegex);
    }

    @Override
    public List<AutoBookRequest> buildFromUri(String filePath) throws IOException {
        String content = AutoBookXMLReader.readFromFile(filePath);
        List<AutoBookRequest> requests = buildFromSource(content, autoBookParser);
        List<AutoBookInfo> infos = buildFromSource(content, autoBookInfoParser);
        for (AutoBookRequest request : requests) {
            for (AutoBookInfo info : infos) {
                if (request.getOrderId().equals(info.getOrderId())) {
                    request.setAutoBookInfo(info);
                }
            }
        }
        Collections.sort(requests);
        return requests;
    }
}
