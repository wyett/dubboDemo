package com.wyett.v3.services.annotations;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 17:25
 * @description: TODO
 */

@Service(timeout = 5000)
public class ProviderServiceImplAnnotation implements ProviderServiceAnnotation {
    public String sayHiAnnotation(String word) {
        return word;
    }
}
