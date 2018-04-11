package com.autobook.core;

import com.autobook.bean.AutoBookRequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public class AutoBookRequestParser extends AbstractParser {


    public AutoBookRequestParser(PatternRegex patternRegex) {
        super(patternRegex);
    }

    @Override
    public List<String> groupContent(String content) {
        return groupContent(content, patternRegex.getAutoBookRequestReg());
    }

    @Override
    public AutoBookRequest parse(String source) throws JAXBException {
        AutoBookRequest request = null;
        JAXBContext context = JAXBContext.newInstance(AutoBookRequest.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StringReader reader = new StringReader(source);
        request = (AutoBookRequest) unmarshaller.unmarshal(reader);
        return request;
    }

}
