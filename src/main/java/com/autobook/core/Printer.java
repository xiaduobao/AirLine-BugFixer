package com.autobook.core;

import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public interface Printer<T> {

    void print(List<T> list);
}
