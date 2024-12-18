package com.github.coderjingtao.core;

/**
 * @author Joseph.Liu
 */
public class MyService {

    private final String message;

    public MyService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void printMessage() {
        System.out.println("message = " + message);
    }
}
