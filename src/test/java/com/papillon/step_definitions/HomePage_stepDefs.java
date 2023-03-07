package com.papillon.step_definitions;

import com.papillon.pages.HomePage;
import com.papillon.utilities.BrowserUtils;
import com.papillon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePage_stepDefs {
    HomePage homePage=new HomePage();

    @Given("The user should be check modules")
    public void the_user_should_be_check_modules() {
        homePage.hoverOverModuleMtd("Kurumsal");
        BrowserUtils.waitFor(1);
        homePage.hoverOverModuleMtd("Hizmetlerimiz");
        BrowserUtils.waitFor(1);
        homePage.hoverOverModuleMtd("Eğitimler");
        BrowserUtils.waitFor(1);
        homePage.hoverOverModuleMtd("Blog");
        BrowserUtils.waitFor(1);
    }
    @When("The user should be click all modules")
    public void the_user_should_be_click_all_modules() {

            homePage.getModuleMtd("Kurumsal");
            BrowserUtils.waitFor(1);
            Driver.getDriver().navigate().back();
            homePage.getModuleMtd("Uzmanlarımız");
            BrowserUtils.waitFor(1);
            Driver.getDriver().navigate().back();
            homePage.getModuleMtd("Hizmetlerimiz");
            BrowserUtils.waitFor(1);
            Driver.getDriver().navigate().back();
            homePage.getModuleMtd("Eğitimler");
            BrowserUtils.waitFor(1);
            Driver.getDriver().navigate().back();
            homePage.getModuleMtd("Blog");
            BrowserUtils.waitFor(1);
            Driver.getDriver().navigate().back();

    }
    @When("The user should be open training_appointment modules")
    public void the_user_should_be_open_training_appointment_modules() {
        homePage.egitimRandevuMtd();
    }
    @When("The user should be click appointment")
    public void the_user_should_be_click_appointment() {
        homePage.clickAppointmentMethod();
    }
    @When("The user should be enter valid credentials for appointment")
    public void the_user_should_be_enter_valid_credentials_for_appointment() {
        homePage.createAppointmentMethod();
    }

}
