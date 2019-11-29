package com.wyett.v2;

import com.wyett.v2.services.SayHiService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 16:49
 * @description: TODO
 */

public class V2ConsumerMain {
    public static void main(String[] args) {
        //application
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("v2consumer");
        applicationConfig.setOwner("wyett");

        // registry
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("zk1:2181,zk3:2181,zk3:2181");

        // reference
        ReferenceConfig<SayHiService> referenceConfig = new ReferenceConfig<SayHiService>();
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(SayHiService.class);

        SayHiService sayHiService = referenceConfig.get();
        sayHiService.sayHi("hello");
    }
}
