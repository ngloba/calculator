package com.epam.cdp.tests;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class TgCalcTestDouble extends BaseTestJunit {

    @Test
    @UseDataProvider("valuesForTgTestDouble")
public void tgCalcTestDouble(double a, double expectedResult) {
        double result = calculator.tg(a);
   //     double result = Math.tan(a);
        Assert.assertTrue(Math.floor(result) == Math.floor(expectedResult));
    }

    @DataProvider
    public static Object[][] valuesForTgTestDouble(){
        return new Object[][] {
                {45, 1.61977519},
                {30, -6.4053312},
                {200, -1.79252748},
                {0, 0}

        };
    }
}
