package com.papillon.pages;

import com.papillon.utilities.ConfigurationReader;
import com.papillon.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
