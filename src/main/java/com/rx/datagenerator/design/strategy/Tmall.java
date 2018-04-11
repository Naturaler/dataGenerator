package com.rx.datagenerator.design.strategy;

/**
 * Created by r.x on 2018/4/11.
 */
public class Tmall {
    public static void main(String[] args) {
        IDiscount discount = new EightyPercent();
        System.out.printf("春节打折策略：%s\r\n", discount.discount());
        discount = new TenPercent();
        System.out.printf("换季打折策略：%s\r\n", discount.discount());

        IPostage postage = new FreePostage();
        System.out.printf("江浙地区邮费：%s\r\n", postage.postage(100));
        postage = new WeightPostage();
        System.out.printf("西藏地区邮费：%s\r\n", postage.postage(100));
    }
}
