package com.autobook.core;

import com.autobook.bean.AutoBookInfo;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public class AbstractBuilder<T> implements Builder<T> {


    @Override
    public List<T> buildFromSource(String source, Parser parser) {

        List<String> groups = parser.groupContent(source);
        List<T> ts = new ArrayList<>();
        for (String item : groups) {
            item = item.trim();
            T t = null;
            try {
                t = (T) parser.parse(item);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
            ts.add(t);
        }
        return ts;
    }
}
