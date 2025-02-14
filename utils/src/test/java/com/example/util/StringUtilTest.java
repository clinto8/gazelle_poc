package com.example.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
    @Test
    void testCapitalize() {
        assertEquals("Hello", StringUtil.capitalize("hello"));
        assertEquals("World", StringUtil.capitalize("world"));
        assertEquals("", StringUtil.capitalize(""));
        assertNull(StringUtil.capitalize(null));
    }

    @Test
    void testGetFormattedMessage() {
        assertEquals("Dependency injection test", StringUtil.useUtilityHelper("dependency injection test"));
        assertEquals("Another test", StringUtil.useUtilityHelper("another test"));
    }
}