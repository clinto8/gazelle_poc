package com.example.util;
import com.example.util2.UtilityHelper;
import com.example.util3.UtilityHelper2;

public class StringUtil {
    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public static String useUtilityHelper(String message) {
        UtilityHelper helper = new UtilityHelper(message);
        return capitalize(helper.getMessage());
    }

    public static String useUtilityHelper2(String message) {
        UtilityHelper2 helper2 = new UtilityHelper2(message);
        return capitalize(helper2.getMessage());
    }
}