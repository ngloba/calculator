package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class DivCalcTest extends BaseTest {

    @Test (dataProvider = "valuesForDivTestLong")
    public void divTestLong (long a, long b, long expectedResult) {
     long result = calculator.div(a,b);

        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "valuesForDivTestLong")
    public Object[][] valuesForDivTest() {
        return new Object[][] {
                {6, 2, 3},
                {5, 3, 1},
                {0, 2, 0},
//                {200, 0, 0}
        };
    }
}
