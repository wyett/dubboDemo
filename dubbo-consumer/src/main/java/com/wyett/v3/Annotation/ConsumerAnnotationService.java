package com.wyett.v3.Annotation;

import com.wyett.v3.services.annotations.ProviderServiceAnnotation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author : wyettLei
 * @date : Created in 2019/11/29 17:51
 * @description: TODO
 */

@Component("annotationConsumer")
public class ConsumerAnnotationService {
    @Reference
    private ProviderServiceAnnotation providerServiceAnnotation;

    public String sayHi(String words) {
        return providerServiceAnnotation.sayHiAnnotation(words);
    }
}
