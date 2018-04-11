package com.rx.datagenerator.design.proxyPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.time.LocalDateTime;

/**
 * Created by r.x on 2018/3/28.
 */
public class Proxy implements IServer {
    private Logger logger = LoggerFactory.getLogger(Proxy.class);
    private RealServer server;

    @Override
    public LocalDateTime current(String user) {
        if (user.equals("admin")) {
            logger.info(user + "正在访问服务器...");
            server = new RealServer();
            return server.current(user);
        }
        throw new RuntimeException("用户[" + user + "]无访问权限");
    }

    public static void main(String[] args) {
        try {
            Socket client = new Socket("192.168.163.137", 1433);
            InputStream input = client.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String content = null;
            while ((content = reader.readLine()) != null) {
                System.out.println(content);
            }
            input.close();
            reader.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
