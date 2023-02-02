package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean res = Integer.parseInt(str) >= 0;
        return res;
    }
}
