package com.rx.datagenerator.design.decorator;

/**
 * Created by r.x on 2018/4/10.
 */
// 蜂蜜
public class Honey extends Seasoning {
    public Honey(Drink drink) {
        super(drink);
    }

    @Override
    public String description() {
        return drink.description() + ", 蜂蜜";
    }

    @Override
    public Double cost() {
        return drink.cost() + 0.5;
    }
}
