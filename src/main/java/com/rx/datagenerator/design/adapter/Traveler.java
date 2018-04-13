package com.rx.datagenerator.design.adapter;

/**
 * Created by r.x on 2018/4/12.
 */
public class Traveler {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        ITwoSocket twoSocket = new TwoSocket();
        SocketAdapter adapter = new SocketAdapter(twoSocket);
        hotel.setThreeSocket(adapter);
        hotel.charge();
    }
}
