package com.epam.cdp.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalcTestDouble extends BaseTest {

    @Test(dataProvider = "values")
    public void sinCalcTestDouble (double a, double expectedResult){
        double result = calculator.sin(a);
        Assert.assertEquals(Math.floor(result), Math.floor(expectedResult));
    }

    @DataProvider(name = "values")
    public Object[][] values() {
        return new Object[][] {
                {70, 0.342020143325669},
                {1, 0.8414709848078965},
                {0, 0},
                {-1, -0.01745241}
        };
    }
}
