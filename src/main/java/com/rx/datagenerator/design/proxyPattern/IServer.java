package com.rx.datagenerator.design.proxyPattern;

import java.time.LocalDateTime;

/**
 * Created by r.x on 2018/3/28.
 */
public interface IServer {
    LocalDateTime current(String user);
}
