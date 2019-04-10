package com.epam.cdp.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class MultCalcTestDouble extends BaseTestJunit {

 @Test
 @UseDataProvider ("valuesForMultTest")
    public void multTestDouble(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertTrue(result == expectedResult);
    }

@DataProvider
    public static Object[][] valuesForMultTest() {
     return new Object[][] {
             {15.00, -1, -15.00},
             {3, 5, 15.00},
             {0, 2, 0},
             {-200.02, 0, 0}
     };
    }
}
