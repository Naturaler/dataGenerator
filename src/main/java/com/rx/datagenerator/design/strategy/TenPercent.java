package com.rx.datagenerator.design.strategy;

/**
 * Created by r.x on 2018/4/11.
 */
// 1折
public class TenPercent implements IDiscount {
    @Override
    public Integer discount() {
        return 10;
    }
}
