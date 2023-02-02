package com.epam.demo;

import java.util.List;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            try {
                if (Float.parseFloat(str) <= 0) return false;
            } catch (NumberFormatException e) {
                System.out.println("NumberFormat Exception: invalid input string");
                return false;
            }
        }
        return true;
    }
}