package com.rx.datagenerator.design.adapter;

/**
 * Created by r.x on 2018/4/12.
 */
// 适配器
public class SocketAdapter implements IThreeSocket {
    private ITwoSocket twoSocket;

    public SocketAdapter(ITwoSocket twoSocket) {
        this.twoSocket = twoSocket;
    }

    @Override
    public void threeSocket() {
        twoSocket.twoSocket();
    }
}
