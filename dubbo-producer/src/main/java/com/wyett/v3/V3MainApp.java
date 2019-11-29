package com.wyett.v3;

import com.wyett.v3.configuration.DubboConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 17:44
 * @description: TODO
 */

public class V3MainApp {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DubboConfiguration.class);
        context.start();
        System.in.read();
    }
}
