package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalcTest extends BaseTest {


@Test(dataProvider = "valuesForSubTest", groups = "long")
    public void twoMinusOne (long a, long b, long expectedValue) {
long result = calculator.sub(a,b);
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


}
