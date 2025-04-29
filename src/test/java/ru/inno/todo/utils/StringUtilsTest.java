package ru.inno.todo.utils;

import inno.cucumber.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {
    //TDD TestDrivenDevelopment
    //Test Driver Development

    @Test
    public void isBlankTrueForEmptyStrings(){
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isBlank(""));
    }
    @Test
    public void isBlankTrueForSpace(){
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isBlank(""));
    }
    @Test
    public void isBlankFalseForLineWithChar(){
        StringUtils stringUtils = new StringUtils();
        assertFalse(stringUtils.isBlank("     /    "));
    }
    @Test
    public void isBlankTrueForManySpaces(){
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isBlank("         "));
    }
    // Behavior DD
}
