package com.epam.cdp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalcTest extends BaseTest {


@Test
    public void twoMinusOne () {
long result = calculator.sub(2,1);
    Assert.assertTrue(result == 1);
    }


}
