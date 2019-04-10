package com.epam.cdp.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class CosCalcTestDouble extends BaseTestJunit {

    @Test
    @UseDataProvider("values")
    public void cosCalcTestDouble(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertTrue(Math.floor(result) == Math.floor(expectedResult));
    }

    @DataProvider
    public static Object[][] values() {
        return new Object[][] {
                {70, 0.342020143325669},
                {50, 0.64278761},
                {0, 1},
                {-1, 0.9998477}
        };
    }
}
