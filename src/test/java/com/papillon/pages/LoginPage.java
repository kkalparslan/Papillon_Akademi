package com.papillon.pages;

import com.papillon.utilities.BrowserUtils;
import com.papillon.utilities.ConfigurationReader;
import com.papillon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "#ici")
    public WebElement oturumAc_loc;

    @FindBy(className = "icon_lock_alt")
    public WebElement girisYap_loc;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox_loc;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox_loc;

    @FindBy(xpath = "//*[.='Giriş Yap']")
    public WebElement girisYapButton_loc;

    @FindBy(xpath = "//a[@title='alp öz']")
    public WebElement title_loc;

    public void navigateUrlMethod(){
        Driver.getDriver().get(ConfigurationReader.get("url"));
    }

    public void openAccountMethod(){
        oturumAc_loc.click();
        BrowserUtils.waitFor(1);
        girisYap_loc.click();
        BrowserUtils.waitFor(1);
    }

    public void loginMethod(){
        emailBox_loc.click();
        emailBox_loc.sendKeys(ConfigurationReader.get("userEmail"));
        BrowserUtils.waitFor(1);
        passwordBox_loc.click();
        passwordBox_loc.sendKeys(ConfigurationReader.get("userPassword"));
        BrowserUtils.waitFor(1);
        girisYapButton_loc.click();
        BrowserUtils.waitFor(1);
    }

    public String getTextMtd(){
        return title_loc.getAttribute("title");
    }
}
