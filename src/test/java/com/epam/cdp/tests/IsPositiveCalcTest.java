package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalcTest extends BaseTest {

    @Test(dataProvider = "values")
    public void isPositiveCalcTest (long a, boolean expectedResult) {
        boolean result  = calculator.isPositive(a);
        Assert.assertTrue(result == expectedResult);
    }

    @DataProvider(name = "values")
    public Object[][] values() {
        return new Object[][] {
                {5, true},
                {-1, false},
                {0, true},
                {1566787, true}
        };
    }

}
