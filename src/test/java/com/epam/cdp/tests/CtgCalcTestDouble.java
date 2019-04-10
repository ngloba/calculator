package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalcTestDouble extends BaseTest {

    @Test(dataProvider = "values")
    public void ctgCalcTestDouble(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(Math.floor(result), Math.floor(expectedResult));
    }

    @DataProvider(name = "values")
    public Object[][] values() {
        return new Object[][] {
                {60, 1},
               {0, 0},
                {1, 0.7615941559557649}
        };
    }
}
