package com.rx.datagenerator.design.decorator;

/**
 * Created by r.x on 2018/4/10.
 */
// 芝士
public class Cheese extends Seasoning {
    public Cheese(Drink drink) {
        super(drink);
    }

    @Override
    public String description() {
        return drink.description() + ", 芝士";
    }

    @Override
    public Double cost() {
        return drink.cost() + 3.0;
    }
}
