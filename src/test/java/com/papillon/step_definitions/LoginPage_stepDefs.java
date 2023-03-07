package com.papillon.step_definitions;

import com.papillon.pages.LoginPage;
import com.papillon.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPage_stepDefs {
    LoginPage loginPage=new LoginPage();

    @Given("The user should be on the web page")
    public void the_user_should_be_on_the_web_page() {
        loginPage.navigateUrlMethod();
    }

    @When("The user should be open the account")
    public void the_user_should_be_open_the_account() {
        loginPage.openAccountMethod();
    }

    @When("The user should be enter valid credentials")
    public void the_user_should_be_enter_valid_credentials() {
        loginPage.loginMethod();
    }
    @Then("The user should be on the home page")
    public void the_user_should_be_on_the_home_page() {
        String expectedMsg="alp öz";
        String actualMsg=loginPage.getTextMtd();
        System.out.println("expectedMsg = " + expectedMsg);
        System.out.println("actualMsg = " + actualMsg);
        BrowserUtils.waitFor(2);
        Assert.assertEquals(actualMsg, expectedMsg);
    }

}
