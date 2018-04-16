package com.autobook.core;

import org.joor.Reflect;

import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public abstract class AbstractPrinter<T,M> {

    abstract public void print(List<T> list);

    protected String fieldValue (M  m ,String name){
        return  String.valueOf(Reflect.on(m).field(name).get());
    }

    protected String fieldValues(List<? extends M> list, String name) {
        StringBuffer buffer = new StringBuffer();
        for (M m: list) {
            buffer.append(fieldValue(m ,name)).append("/");
        }
        return buffer.substring(0, buffer.lastIndexOf("/"));
    }
}
