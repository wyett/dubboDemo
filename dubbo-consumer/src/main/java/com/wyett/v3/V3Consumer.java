package com.wyett.v3;

import com.wyett.v3.Annotation.ConsumerAnnotationService;
import com.wyett.v3.configuration.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 18:13
 * @description: TODO
 */

public class V3Consumer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        ConsumerAnnotationService cas = context.getBean(ConsumerAnnotationService.class);
        String res = cas.sayHi("hello");
        System.out.println(res);
    }
}
