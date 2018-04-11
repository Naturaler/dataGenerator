package com.rx.datagenerator.design.decorator;

/**
 * Created by r.x on 2018/4/10.
 */
// 奶茶
public class Tea extends Drink {

    @Override
    public String description() {
        return "tea";
    }

    @Override
    public Double cost() {
        return 1.0;
    }
}
