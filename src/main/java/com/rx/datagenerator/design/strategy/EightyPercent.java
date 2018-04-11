package com.rx.datagenerator.design.strategy;

/**
 * Created by r.x on 2018/4/11.
 */
// 8折
public class EightyPercent implements IDiscount {
    @Override
    public Integer discount() {
        return 80;
    }
}
