package com.rx.datagenerator.design.observer;

/**
 * Created by r.x on 2018/4/4.
 */
public class MainTest {

    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        IObserver a = new ConcreteObserver("a");
        IObserver b = new ConcreteObserver("b");
        IObserver c = new ConcreteObserver("c");
        subject.register(a);
        subject.register(b);
        subject.register(c);
        subject.noticeAll(12);

        System.out.println("------- after removed b -------");
        subject.unregistered(b);
        subject.noticeAll(20);
    }
}
