package com.autobook.core;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class AutoBookXMLReader {

    private static final String ABSOLUTE_PATH = "E:\\AutoBookRequestXML.xml";

    public static String readFromFile(String uri) throws IOException {
        String path = null;
        if (StringUtils.isNotEmpty(uri)) {
            path = uri;
        } else {
            path = ABSOLUTE_PATH;
        }

        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = null;
        FileReader reader = null;
        try {
            reader = new FileReader(path);
            bufferedReader = new BufferedReader(reader);
            String temp = "";
            while (StringUtils.isNotEmpty(temp = bufferedReader.readLine())) {
                stringBuffer.append(temp);
            }
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
        return stringBuffer.toString();
    }
}
