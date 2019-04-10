package com.epam.cdp.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class DivCalcTestDouble extends BaseTestJunit{

    @Test
    @UseDataProvider("valuesForDivTestDouble")
    public void divCalcTestDouble(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertTrue(result == expectedResult);
    }

    @DataProvider
    public static Object[][] valuesForDivTestDouble() {
        return new Object[][] {
                {6, 2.5, 2.4},
                {8.0, 5.0, 1.6},
                {0.00, 2, 0},
//                {200, 0, 0}
        };
    }

}
