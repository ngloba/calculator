package com.epam.cdp.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class IsNegativeCalcTest extends BaseTestJunit {

    @Test
    @UseDataProvider("values")
    public void isNegativeCalcTest(long a, boolean expectedResult) {
        boolean result = calculator.isNegative(a);
        Assert.assertTrue(result == expectedResult);
    }

    @DataProvider
    public static Object[][] values(){
        return new Object[][] {
                {-15, true},
                {0, false},
                {-222222, true},
                {100, false}
        };
    }
}
