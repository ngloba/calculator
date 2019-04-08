package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalcTest extends BaseTest {


@Test(dataProvider = "valuesForSubTest")
    public void twoMinusOne (long a, long b, long expectedValue) {
long result = calculator.sub(a,b);
    Assert.assertTrue(result == expectedValue);
    }



    @Test (dataProvider = "valuesForSubTestDouble")
    public void subTestDouble (double a, double b, double expectedValue) {
    double result = calculator.sub(a, b);
    Assert.assertTrue(result == expectedValue);
    }

 @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub() {
    return new Object[][] {
            {10,23,-13},
            {10,-1,11},
            {0,0,0},
            {-5, 100, -105}
    };


    }

    @DataProvider (name = "valuesForSubTestDouble")
    public Object[][] valuesForSubDouble() {
    return new Object[][] {
            {0.5, 0.1, 0.4},
            {0.00, 0, 0},
            {-10.01, 0.01, -10.02},
            {0.7, -0.5, 1.2}
    };
    }

}
