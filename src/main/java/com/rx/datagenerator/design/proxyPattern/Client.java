package com.rx.datagenerator.design.proxyPattern;

/**
 * Created by r.x on 2018/3/28.
 */
public class Client {
    public static void main(String[] args) {
        IServer server = new Proxy();
        server.current("admin");
        server.current("root");
    }
}
