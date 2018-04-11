package com.rx.datagenerator.design.strategy;

/**
 * Created by r.x on 2018/4/11.
 */
// 邮费策略
public interface IPostage {
    Integer postage(Integer weight);
}
