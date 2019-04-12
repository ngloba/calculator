package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

public class SumCalcTestDouble extends BaseTest{

    @Test(dataProvider = "valuesForSumTestDouble", groups = "double")
    public void sumTestDouble (double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        DecimalFormat df = new DecimalFormat("###,#");

        Assert.assertEquals(df.format(result), df.format(expectedValue), "Wrong result");

    }

    @DataProvider(name = "valuesForSumTestDouble")
    public Object[][] valuesForSumDouble() {
        return new Object[][] {
                {1.1, 7.0, 8.1},
                {0.7, -0.5, 0.2},   //the result is 0.19999999999999996 why?
                {0, 0, 0.0},
                {-100.565, 10.565, -90.0 }
        };
    }
}
