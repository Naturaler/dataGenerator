package com.rx.datagenerator.design.singleton;

/**
 * Created by r.x on 2018/4/1.
 */
public class Withdrawals {

    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        Thread thread = new Thread(() -> account.withdrawal(600), "thread1");
        thread.start();
        Thread thread2 = new Thread(() -> account.withdrawal(600), "thread2");
        thread2.start();
        System.out.println(account.getBalance());
    }
}
