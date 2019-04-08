package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseTest {



    @Test (dataProvider = "valuesForSumTest")
    public void onePlusTwoTest (long a, long b, long expectedValue) {
       long result =  calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Wrong result");
    }

    @Test (dataProvider = "valuesForSumTestDouble")
    public void sumTestDouble (double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Wrong result");

    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {0, 12, 12},
                {-1, 15, 14},
                {12, -5, 7},
                {0, 0, 0}
        };
    }

    @DataProvider (name = "valuesForSumTestDouble")
    public Object[][] valuesForSumDouble() {
        return new Object[][] {
                {1.1, 7.0, 8.1},
          //    {0.7, -0.5, 0.2},   //the result is 0.19999999999999996 why?
                {0, 0, 0.0},
                {-100.565, 10.565, -90.0 }
        };
    }
}
