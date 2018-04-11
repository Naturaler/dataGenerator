package com.rx.datagenerator.design.observer;

/**
 * Created by r.x on 2018/4/4.
 */
public class ConcreteObserver implements IObserver {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Object value) {
        System.out.println(name + " had updated..." + value);
    }
}
