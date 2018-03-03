package com.rx.datagenerator.entity;

/**
 * Created by r.x on 2018/2/12.
 */
public interface DataScope<T, V> {
    T min();
    T max();
    V step();
}
