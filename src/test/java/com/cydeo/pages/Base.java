package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    NextBasePages nextBasePages = new NextBasePages();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3000);

    @Before
    public void setUp (){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        nextBasePages.login("helpdesk35@cybertekschool.com", "UserUser");
        nextBasePages.logInBtn.click();
        wait.until(ExpectedConditions.titleIs("(29) Portal"));
    }

    @After
    public void tearDown () {
        Driver.closeDriver();
    }
}
