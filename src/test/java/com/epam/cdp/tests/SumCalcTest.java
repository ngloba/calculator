package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseTest {



    @Test (groups = "long", dataProvider = "valuesForSumTest")
    public void onePlusTwoTest (long a, long b, long expectedValue) {
       long result =  calculator.sum(a, b);
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


}
