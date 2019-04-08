package com.epam.cdp.tests;

import org.junit.Assert;
import org.junit.Test;

public class MultCalcTest extends BaseTestJunit{

@Test
    public void multTestLong () {
    long result = calculator.mult(2,5);
    Assert.assertEquals(10, result);
}
}
