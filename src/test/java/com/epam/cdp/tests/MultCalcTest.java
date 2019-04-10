package com.epam.cdp.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class MultCalcTest extends BaseTestJunit{

@Test
@UseDataProvider("valuesForMultTest")
    public void multTestLong (long a, long b, long expectedResult) {
    long result = calculator.mult(a, b);
    Assert.assertEquals(expectedResult, result);
}

@DataProvider
    public static Object[][] valuesForMultTest  () {
    return new Object[][] {
            {15, -1, -15},
            {3, 5, 15},
            {0, 2, 0},
            {-200, 0, 0}
    };
    }
}
