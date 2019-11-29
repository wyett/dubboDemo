package com.wyett.v1;

import com.wyett.v1.services.SayHiService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 14:06
 * @description: TODO
 */

public class ConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        SayHiService sayHiService = (SayHiService) context.getBean("providerService");
        String words = sayHiService.sayHi("Hi,Tom");
        System.out.println(words);
        System.in.read();
    }
}
