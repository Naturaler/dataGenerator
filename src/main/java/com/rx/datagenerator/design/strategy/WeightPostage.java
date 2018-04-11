package com.rx.datagenerator.design.strategy;

/**
 * Created by r.x on 2018/4/11.
 */
// 按斤计
public class WeightPostage implements IPostage {
    @Override
    public Integer postage(Integer weight) {
        return weight * 10;
    }
}
