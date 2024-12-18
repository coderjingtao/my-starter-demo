package com.github.coderjingtao.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Joseph.Liu
 */
@ConfigurationProperties(prefix = "my.utils")
public class MyStringUtilsProperties {

    private boolean upperCase = true;

    public boolean isUpperCase() {
        return upperCase;
    }

    public void setUpperCase(boolean upperCase) {
        this.upperCase = upperCase;
    }
}
