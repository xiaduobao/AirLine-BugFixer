package com.autobook.core;

import com.autobook.bean.AirSegment;
import com.autobook.bean.AutoBookRequest;
import com.autobook.bean.Passenger;
import org.joor.Reflect;

import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class AutoBookRequestPrinter extends AbstractPrinter<AutoBookRequest,Object> {

    private Style style;

    private static final String EMPTY = "empty";

    public AutoBookRequestPrinter() {
        this.style = new DefualtStyleFactory().defualtStyle();
    }

    public AutoBookRequestPrinter(Style style) {
        this.style = style;
    }

    @Override
    public void print(List<AutoBookRequest> requestList) {

        String format = style.getPrintFormat();
        String[] fieldNames = format.split("\\|");
        System.out.println("index | " + format);
        int count = 1;
        for (AutoBookRequest request : requestList) {
            StringBuffer buffer = new StringBuffer();
            for (String name : fieldNames) {
                name = name.trim();
                int index = ClassFieldContext.indexOf(name);
                String value = valueOfFieldByIndex(request, name, index);
                buffer.append(value).append(" ").append(style.getSeparator());
            }
            System.out.println(count++ + "    | " + buffer);
        }
    }

    private String valueOfFieldByIndex(AutoBookRequest request, String name, int index) {
        switch (index) {
            case 1:
                return Reflect.on(request).field(name).get();
            case 2:
                return fieldValues(request.getAirSegments(), name);
            case 3:
                return fieldValues(request.getPassengers(), name);
            case 4:
                if (request.getAutoBookInfo() != null) {
                    return Reflect.on(request.getAutoBookInfo()).field(name).get();
                }
                return EMPTY;
            case 0:
                return EMPTY;
            default:
                return EMPTY;
        }
    }
}
