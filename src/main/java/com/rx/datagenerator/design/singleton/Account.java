package com.rx.datagenerator.design.singleton;

/**
 * Created by r.x on 2018/4/1.
 */
public class Account {
    private String user;
    private Integer balance;

    public void withdrawal(Integer money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(Thread.currentThread().getName() +
                    "取款成功。取了" + money + "钱，剩余" + balance + "钱");
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
