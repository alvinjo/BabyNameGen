package com.qa.BabyNameGen.util;

import org.junit.Assert;
import org.junit.Test;

public class NameGeneratorTest {

    private static final String STARTS_WITH_1 = "as";
    private static final String STARTS_WITH_2 = "asama";
    private static final int LENGTH_1 = 5;
    private static final int LENGTH_2 = 10;
    private static final int LENGTH_3 = 2;

    @Test
    public void stringBeginsWithStartsWith() {
        String actual = NameGenerator.generateString(LENGTH_1, STARTS_WITH_1).substring(0,2);
        String expected = STARTS_WITH_1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generatesProvidedLength(){
        int actual = NameGenerator.generateString(LENGTH_2, STARTS_WITH_2).length();
        int expected = LENGTH_2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringGreaterThanLength(){
        String actual = NameGenerator.generateString(LENGTH_3, STARTS_WITH_2);
        String expected = "";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringEqualToLength(){
        String actual = NameGenerator.generateString(LENGTH_3, STARTS_WITH_1);
        String expected = STARTS_WITH_1;
        Assert.assertEquals(expected, actual);
    }

}