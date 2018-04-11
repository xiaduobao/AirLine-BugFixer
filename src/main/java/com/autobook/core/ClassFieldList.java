package com.autobook.core;

import com.autobook.bean.AirSegment;
import com.autobook.bean.AutoBookInfo;
import com.autobook.bean.AutoBookRequest;
import com.autobook.bean.Passenger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class ClassFieldList {

    private static List<String> rootFiledList = new ArrayList<>();
    private static List<String> segmentFiledList = new ArrayList<>();
    private static List<String> passengersFiledList = new ArrayList<>();
    private static List<String> autoBookInfoFiledList = new ArrayList<>();


    static {
        Field[] fields = AutoBookRequest.class.getDeclaredFields();
        for (Field field : fields) {
            rootFiledList.add(field.getName());
        }

        fields = AirSegment.class.getDeclaredFields();
        for (Field field : fields) {
            segmentFiledList.add(field.getName());
        }

        fields = Passenger.class.getDeclaredFields();
        for (Field field : fields) {
            passengersFiledList.add(field.getName());
        }

        fields = AutoBookInfo.class.getDeclaredFields();
        for (Field field : fields) {
            autoBookInfoFiledList.add(field.getName());
        }
    }

    public static int indexOf(String field) {
        for (String fieldName : rootFiledList) {
            if (fieldName.contains(field)) {
                return 1;
            }
        }

        for (String fieldName : segmentFiledList) {
            if (fieldName.contains(field)) {
                return 2;
            }
        }

        for (String fieldName : passengersFiledList) {
            if (fieldName.contains(field)) {
                return 3;
            }
        }

        for (String fieldName : autoBookInfoFiledList) {
            if (fieldName.contains(field)) {
                return 4;
            }
        }

        return 0;
    }

}
