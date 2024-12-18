package com.github.coderjingtao.utils;

/**
 * @author Joseph.Liu
 */
public class MyStringUtils {

    private static boolean upperCase = true;

    public static void setUpperCase(boolean upper) {
        upperCase = upper;
    }

    public static String convert(String input){
        if(input == null) return null;
        return upperCase ? input.toUpperCase() : input.toLowerCase();
    }


}
