package com.rx.datagenerator.design.decorator;

/**
 * Created by r.x on 2018/4/10.
 */
// 调料的父类
public abstract class Seasoning extends Drink {
    protected Drink drink;

    public Seasoning(Drink drink) {
        this.drink = drink;
    }
}
