package com.wyett.v3.configuration;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 18:00
 * @description: TODO
 */

@Configuration
@EnableDubbo(scanBasePackages = "com.wyett.v3.Annotation")
@ComponentScan(value = "com.wyett.v3.Annotation")
public class ConsumerConfiguration {
    @Bean
    public ApplicationConfig getApplicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-annotation-consumer");
        Map<String, String> mss = new HashMap<String, String>();
        mss.put("qos.enable","true");
        mss.put("qos.accept.foreign.ip","false");
        mss.put("qos.port","33333");
        applicationConfig.setParameters(mss);
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig getConsumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
    }

    @Bean
    public RegistryConfig getRegistryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("10.18.56.30:2181,10.18.57.168:2181,10.18.56.149:2181");
        return registryConfig;
    }
}
