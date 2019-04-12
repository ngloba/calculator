package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalcTestDouble extends BaseTest {

    @Test(dataProvider = "valuesForSqrtTestDouble", groups = "double")
    public void sqrtCalcTestDouble (double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult);

    }

    @DataProvider(name = "valuesForSqrtTestDouble")
    public Object[][] valuesForSqrtTestDouble() {
        return new Object[][] {
                {25, 5},
                {36,6},
                {240.25, 15.5},
                {0, 0},
                {-144, 12}
        };
    }
}
