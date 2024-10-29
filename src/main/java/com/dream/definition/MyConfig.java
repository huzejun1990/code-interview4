package com.dream.definition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: huzejun
 * @Date: 2024/10/29 17:32
 */

@Configuration
public class MyConfig {

    @Bean   // ConfigurationClassBeanDefinition //描述
    public String aa() {
        return "选你所爱，爱你所选";
    }
}
