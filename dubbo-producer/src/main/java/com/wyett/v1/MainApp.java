package com.wyett.v1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 13:38
 * @description: TODO
 */

public class MainApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/provider.xml");
        context.start();
        System.in.read();
    }
}
