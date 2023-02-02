package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            return (Float.parseFloat(str) > 0);
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
