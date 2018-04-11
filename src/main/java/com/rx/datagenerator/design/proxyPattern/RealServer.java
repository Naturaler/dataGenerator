package com.rx.datagenerator.design.proxyPattern;

import java.time.LocalDateTime;

/**
 * Created by r.x on 2018/3/28.
 */
public class RealServer implements IServer {
    @Override
    public LocalDateTime current(String user) {
        return LocalDateTime.now();
    }
}
