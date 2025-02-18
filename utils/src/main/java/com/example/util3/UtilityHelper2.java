package com.example.util3;
import org.apache.commons.lang3.StringUtils;

public class UtilityHelper2 {
    private final String message;

    public UtilityHelper2(String message) {
        this.message = message;
    }

    public String getMessage() {
        return StringUtils.trim(message);
    }
}