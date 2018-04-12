package com.autobook.core;

import com.autobook.annotation.CollectField;
import com.autobook.bean.AirSegment;
import com.autobook.bean.AutoBookInfo;
import com.autobook.bean.AutoBookRequest;
import com.autobook.bean.Passenger;
import com.autobook.config.Configuration;
import com.autobook.util.ClassLoaderUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiabaowang on 2018/4/12.
 */
public class ClassFieldContext {

    private static Map<Integer, FieldBase> fieldBaseMap;

    private static String pkgName = Configuration.valueOf("autobook.field.collect.pkg");

    private static boolean useClassLoaderStyle = "T".equals(Configuration.valueOf("autobook.use.classloader.style"));

    static {
        fieldBaseMap = new HashMap<>();
        if (useClassLoaderStyle) {

            initFieldCollectedClass();
        }else{
             fieldBaseMap.put(1,new FieldBase(AutoBookRequest.class, 1));
            fieldBaseMap.put(2,new FieldBase(AirSegment.class, 2));
            fieldBaseMap.put(3,new FieldBase(Passenger.class, 3));
            fieldBaseMap.put(4,new FieldBase(AutoBookInfo.class, 4));
        }

    }

    public static int indexOf(String field) {
        for (Map.Entry<Integer, FieldBase> entry : fieldBaseMap.entrySet()) {
            if (entry.getValue().getFieldList().contains(field)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void initFieldCollectedClass() {
        List<Class> classes = ClassLoaderUtil.loadClassNameFromPkg(pkgName);
        for (Class clazz : classes) {
            Annotation annotation = clazz.getAnnotation(CollectField.class);
            if (annotation != null) {
                int index = ((CollectField) annotation).contextIndex();
                fieldBaseMap.put(index, new FieldBase(clazz, index));
            }
        }
    }

    static class FieldBase {
        private List<String> fieldList = new ArrayList<>();
        private Class clazz;
        private int retVal;

        public FieldBase(Class clazz, int retVal) {
            this.clazz = clazz;
            this.retVal = retVal;
            init();
        }

        private void init() {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                fieldList.add(field.getName());
            }
        }

        public List<String> getFieldList() {
            return fieldList;
        }

        public Class getClazz() {
            return clazz;
        }

        public int getRetVal() {
            return retVal;
        }
    }

}
