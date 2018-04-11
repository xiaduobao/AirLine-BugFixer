package com.autobook.core;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/11.
 */
public interface Builder<T> {

    List<T> buildFromSource(String source, Parser parser) throws IOException, JAXBException;
}
