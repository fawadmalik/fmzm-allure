package com.fmzmproj.allure.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(description = "The whole shebang")
public class AddedTests {
    public void verifyOne(){
        Assert.assertTrue(true, "Expected true");
    }
    public void verifyTwo(){
        Assert.assertFalse(false, "Expected false");
    }
}
