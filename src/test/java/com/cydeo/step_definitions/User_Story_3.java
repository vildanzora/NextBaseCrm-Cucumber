package com.cydeo.step_definitions;

import com.cydeo.pages.Base;
import com.cydeo.pages.NextBasePages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_Story_3 extends Base {
    @Override
    public void setUp() {
        super.setUp();
    }
    NextBasePages element = new NextBasePages();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3000);

    @When("User should be able to click search box")
    public void user_should_be_able_to_click_search_box() {
        element.searchBox.click();

    }

    @When("User should be able to write anything")
    public void userShouldBeAbleToWriteAnything() {
        element.searchBox.sendKeys("help");
       // wait.until(ExpectedConditions.invisibilityOf(element.suggestedMenu));
    }


    @Then("User should be able to see suggested modules")
    public void user_should_be_able_to_see_suggested_modules() {
        System.out.println("element.suggestedMenu.isDisplayed() = " + element.suggestedMenu.isDisplayed());
        Assert.assertTrue("Seeing suggested menu verification is failed", element.suggestedMenu.isDisplayed());

    }


}
