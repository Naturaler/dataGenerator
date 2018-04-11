package com.rx.datagenerator.design.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by r.x on 2018/4/1.
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {

    }

    // 实例化方法要进行同步控制，防止并发问题
    public static /*synchronized*/ LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        LazySingleton singleton3 = LazySingleton.getInstance();
        System.out.println(singleton == singleton1); // true
        System.out.println(singleton1 == singleton2); // true
        System.out.println(singleton2 == singleton3); // true

        List<AtomicReference<LazySingleton>> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            list.add(new AtomicReference<>());
        }
        System.out.println("before init ..." + (list.get(40).get() == null));
        list.stream().parallel().forEach(item -> {
            new Thread(() -> {
                item.set(LazySingleton.getInstance());
            }).start();
        });
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all are not null ? " + (list.stream().allMatch(instance -> instance.get() != null)));
//        list.forEach(instance -> System.out.println(instance.get()));
        System.out.println("after init ..." + (list.get(40).get() == null));
        list.stream().forEach(instance -> {
            list.forEach(other -> {
                if (other.get() != instance.get()) {
                    System.out.println("------------------------- false -------------------------");
                }
            });
        });

        // 并发测试
        /*AtomicReference<LazySingleton> thSingleton1 = new AtomicReference<>();
        Thread thread1 = new Thread(() -> thSingleton1.set(LazySingleton.getInstance()));
        AtomicReference<LazySingleton> thSingleton2 = new AtomicReference<>();
        Thread thread2 = new Thread(() -> thSingleton2.set(LazySingleton.getInstance()));
        AtomicReference<LazySingleton> thSingleton3 = new AtomicReference<>();
        Thread thread3 = new Thread(() -> thSingleton3.set(LazySingleton.getInstance()));
        AtomicReference<LazySingleton> thSingleton4 = new AtomicReference<>();
        Thread thread4 = new Thread(() -> thSingleton4.set(LazySingleton.getInstance()));
        AtomicReference<LazySingleton> thSingleton5 = new AtomicReference<>();
        Thread thread5 = new Thread(() -> thSingleton5.set(LazySingleton.getInstance()));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (thSingleton1.get() != null && thSingleton2.get() != null) {
            System.out.println("1 == 2 ?" + (thSingleton1.get() == thSingleton2.get()));
        }
        if (thSingleton2.get() != null && thSingleton3.get() != null) {
            System.out.println("2 == 3 ?" + (thSingleton2.get() == thSingleton3.get()));
        }
        if (thSingleton3.get() != null && thSingleton4.get() != null) {
            System.out.println("3 == 4 ?" + (thSingleton3.get() == thSingleton4.get()));
        }
        if (thSingleton4.get() != null && thSingleton5.get() != null) {
            System.out.println("4 == 5 ?" + (thSingleton4.get() == thSingleton5.get()));
        }
        if (thSingleton5.get() != null && thSingleton1.get() != null) {
            System.out.println("5 == 1 ?" + (thSingleton5.get() == thSingleton1.get()));
        }*/
    }
}
