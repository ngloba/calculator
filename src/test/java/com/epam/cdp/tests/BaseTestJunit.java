package com.epam.cdp.tests;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTestJunit {
    protected static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }

}
