package com.epam.demo;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args == null) return false;
        for (String str : args) {
            if (! isPositiveNumber(str)) return false;
//            try {
//                if (Float.parseFloat(str) <= 0) return false;
//            } catch (NumberFormatException | NullPointerException e) {
//                return false;
//            }
        }
        return true;
    }
}