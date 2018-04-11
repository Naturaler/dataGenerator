package com.rx.datagenerator.design.decorator;

/**
 * Created by r.x on 2018/4/10.
 */
// 咖啡
public class Coffee extends Drink {
    @Override
    public String description() {
        return "coffee";
    }

    @Override
    public Double cost() {
        return 2.5;
    }
}
