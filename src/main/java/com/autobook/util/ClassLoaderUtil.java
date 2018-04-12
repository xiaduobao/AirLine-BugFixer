package com.autobook.util;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/12.
 */
public class ClassLoaderUtil {


    public static  List<Class> loadClassNameFromPkg(String pkgName){

        List<Class> classes = new ArrayList<>();
        if(StringUtils.isEmpty(pkgName)){
            return  classes;
        }

        String pkgPath = pkgName.replace("/",".");
        String path = ClassLoaderUtil.class.getClassLoader().getResource(pkgName).getPath();
        File [] files = new File(path).listFiles();

        for(File file : files){
            String fileName = file.getName();
            try {
                Class clazz = Class.forName(pkgPath+"."+fileName.substring(0,fileName.lastIndexOf(".")));
                        classes.add(clazz);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return  classes;
    }

    public static void main(String[] args) {
        String pkgName = "com/autobook/bean";
        List<Class> classes = loadClassNameFromPkg(pkgName);
        for (Class clazz : classes){
            System.out.println(clazz.getName());
        }
    }
}
