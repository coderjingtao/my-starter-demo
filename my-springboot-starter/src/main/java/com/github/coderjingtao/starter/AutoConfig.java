package com.github.coderjingtao.starter;

import com.github.coderjingtao.core.MyService;
import com.github.coderjingtao.utils.MyStringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Joseph.Liu
 */
@Configuration
@EnableConfigurationProperties({MyServiceProperties.class,MyStringUtilsProperties.class})
public class AutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public MyService myService(MyServiceProperties properties) {
        return new MyService(properties.getMessage());
    }

    public AutoConfig(MyStringUtilsProperties myStringUtilsProperties) {
        MyStringUtils.setUpperCase(myStringUtilsProperties.isUpperCase());
    }
}
