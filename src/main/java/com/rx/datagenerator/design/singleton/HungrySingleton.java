package com.rx.datagenerator.design.singleton;

/**
 * Created by r.x on 2018/4/1.
 */
public class HungrySingleton {
    // 静态成员变量
    private static HungrySingleton instance = new HungrySingleton();

    // 私有的构造函数
    private HungrySingleton() {

    }

    // 静态方法
    public static HungrySingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        HungrySingleton singleton = HungrySingleton.getInstance();
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();
        HungrySingleton singleton3 = HungrySingleton.getInstance();
        System.out.println(singleton == singleton1); // true
        System.out.println(singleton1 == singleton2); // true
        System.out.println(singleton2 == singleton3); // true
    }
}
