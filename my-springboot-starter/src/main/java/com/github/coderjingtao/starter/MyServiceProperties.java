package com.github.coderjingtao.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Joseph.Liu
 */
@ConfigurationProperties(prefix = "my.service")
public class MyServiceProperties {

    private String message = "default message";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
