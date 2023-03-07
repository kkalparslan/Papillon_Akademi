package com.papillon.pages;

import com.papillon.utilities.BrowserUtils;
import com.papillon.utilities.ConfigurationReader;
import com.papillon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(linkText = "Randevu Talebi")
    public WebElement randevuTalebi_loc;

    @FindBy(id = "adi_soyadi")
    public WebElement nameSurname_loc;

    @FindBy(css = "#telefon")
    public WebElement phoneNumber_loc;

    @FindBy(id = "eposta")
    public WebElement ePosta_loc;

    @FindBy(id = "aciklama")
    public WebElement explain_loc;

    @FindBy(id = "gonder")
    public WebElement submitBtn_loc;

    public void hoverOverModuleMtd(String name) {
        String module = "//header//a[text()='" + name + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(module));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
        BrowserUtils.waitFor(1);
        // element.click();
        // BrowserUtils.waitFor(1);
//        WebElement element1 = Driver.getDriver().findElement(By.xpath("(//li//a[text()='Misyon'])[1]"));
//        BrowserUtils.clickWithJS(element1); aşağıda browserUtils den çağırdığım method ile direk yaptım
//        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);arguments[0].click()", element1);
    }

    public void getModuleMtd(String name) {
        String module = "//header//a[text()='" + name + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(module));
//        Actions actions=new Actions(Driver.getDriver());
//        actions.moveToElement(element).perform();
        //BrowserUtils.waitFor(1);
        element.click();
        BrowserUtils.waitFor(1);

    }

    public void egitimRandevuMtd() {
        WebElement egitim = Driver.getDriver().findElement(By.xpath("//span[text()='Eğitim / Randevu']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(egitim).perform();
        BrowserUtils.waitFor(2);
    }

    public void clickAppointmentMethod() {
        randevuTalebi_loc.click();
    }

    public void createAppointmentMethod(){

        nameSurname_loc.click();
        nameSurname_loc.sendKeys(ConfigurationReader.get("userFullname"));
        phoneNumber_loc.click();
        phoneNumber_loc.sendKeys(ConfigurationReader.get("userPhone"));
        ePosta_loc.click();
        ePosta_loc.sendKeys(ConfigurationReader.get("userEmail2"));
        explain_loc.click();
        explain_loc.sendKeys(ConfigurationReader.get("note"));
        submitBtn_loc.click();

    }


}
