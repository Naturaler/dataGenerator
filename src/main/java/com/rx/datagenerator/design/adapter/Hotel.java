package com.rx.datagenerator.design.adapter;

/**
 * Created by r.x on 2018/4/12.
 */
// 三接口宾馆
public class Hotel {
    private IThreeSocket threeSocket;

    public void charge() {
        threeSocket.threeSocket();
    }

    public IThreeSocket getThreeSocket() {
        return threeSocket;
    }

    public void setThreeSocket(IThreeSocket threeSocket) {
        this.threeSocket = threeSocket;
    }
}
