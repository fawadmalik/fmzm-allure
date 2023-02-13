package com.fmzmproj.allure.testscripts;

import com.fmzmproj.allure.pages.HomePage;
import io.qameta.allure.Step;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class ToolshopTest extends TestBase {

    public void verifySignInButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.get();
        assertThat(homePage.isSignInButtonDisplayed()).isTrue();
    }

    public void verifySignInButton_failOnPurpose() {
        HomePage homePage = new HomePage(getDriver());
        homePage.get();
        assertThat(homePage.isSignInButtonDisplayed()).isFalse();
    }

    @Step("Login as QA User")
    public void setupLoginUser(){
        Reporter.log("Logged in as QA USer ming shim");
    }
}
