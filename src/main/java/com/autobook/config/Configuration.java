package com.autobook.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by jiabaowang on 2018/4/12.
 */
public class Configuration {

    private static Properties properties ;

    static {
        InputStream inputStream = Configuration.class.getClassLoader().getResourceAsStream("config.properties");
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("加载配置出错");
        }
    }

    public static  String valueOf(String key){
        return  properties.getProperty(key);
    }


}
