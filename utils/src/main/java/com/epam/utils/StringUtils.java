package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if ((str == null) || (str == " ")) return false;
        return (Float.parseFloat(str) > 0);
    }
}
