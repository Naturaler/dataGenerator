package com.rx.datagenerator.design.strategy;

/**
 * Created by r.x on 2018/4/11.
 */
// 包邮
public class FreePostage implements IPostage {
    @Override
    public Integer postage(Integer weight) {
        return 0;
    }
}
