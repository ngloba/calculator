package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalcTestDouble extends BaseTest{

    @Test(dataProvider = "valuesForSubTestDouble")
    public void subTestDouble (double a, double b, double expectedValue) {
        double result = calculator.sub(a, b);
        Assert.assertTrue(result == expectedValue);
    }


    @DataProvider(name = "valuesForSubTestDouble")
    public Object[][] valuesForSubDouble() {
        return new Object[][] {
                {0.5, 0.1, 0.4},
                {0.00, 0, 0},
                {-10.01, 0.01, -10.02},
                {0.7, -0.5, 1.2}
        };
    }

}
