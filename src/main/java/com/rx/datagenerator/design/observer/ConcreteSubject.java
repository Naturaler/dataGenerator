package com.rx.datagenerator.design.observer;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by r.x on 2018/4/4.
 */
public class ConcreteSubject implements ISubject {
    private Collection<IObserver> observers;
    private Integer amount;

    public ConcreteSubject() {
        observers = new HashSet<>();
    }

    @Override
    public boolean register(IObserver observer) {
        observers.add(observer);
        return true;
    }

    @Override
    public boolean unregistered(IObserver observer) {
        observers.remove(observer);
        return true;
    }

    @Override
    public void noticeAll(Object value) {
        if (value instanceof Integer) {
            setAmount((Integer) value);
        }
        for (IObserver observer : observers) {
            observer.update(amount);
        }
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
