package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalcTestDouble extends BaseTest{

    @Test (dataProvider = "valuesForDivTestLong")
    public void powCalcTestLong (double a, double b, double expectedResult) {
        double result = calculator.pow(a,b);

        Assert.assertEquals(result, expectedResult, "Wrong result");
    }

    @DataProvider(name = "valuesForDivTestLong")
    public Object[][] valuesForDivTestLong() {
        return new Object[][]{
                {5, 2, 25},
                {3, 3, 27},
                {12.5, 2, 156.25},
                {15, 0, 1.0},
                {30.2, 1, 30.2}
        };
    }
}
