package com.wyett.v2.services;

import com.wyett.v2.services.impl.SayHiServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 16:35
 * @description: TODO
 */

public class V2Api {
    public static void main(String[] args) throws IOException {
        // application init
        SayHiService sayHiService = new SayHiServiceImpl();

        // application config
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setOwner("wyett");
        applicationConfig.setName("sayhi");

        // registry
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("10.18.56.30:2181,10.18.57.168:2181,10.18.56.149:2181");

        // protocal
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);

        //service
        ServiceConfig<SayHiService> ss = new ServiceConfig<SayHiService>();
        ss.setApplication(applicationConfig);
        ss.setRegistry(registryConfig);
        ss.setProtocol(protocolConfig);
        ss.setInterface(SayHiService.class);
        ss.setRef(sayHiService);
        ss.setVersion("2.0.0");

        // 注册服务
        ss.export();
        System.in.read();


    }
}
