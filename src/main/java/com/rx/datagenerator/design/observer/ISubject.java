package com.rx.datagenerator.design.observer;

/**
 * Created by r.x on 2018/4/3.
 */
public interface ISubject {
    boolean register(IObserver IObserver);

    boolean unregistered(IObserver IObserver);

    void noticeAll(Object value);

}
