package com.cydeo.step_definitions;

import com.cydeo.pages.Base;
import com.cydeo.pages.NextBasePages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_Story_2 extends Base{

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3000);
    NextBasePages element = new NextBasePages();
    @Given("User on the Next Base CRM Dashboard page")
    public void user_on_the_next_base_crm_dashboard_page() {
        setUp();
        wait.until(ExpectedConditions.titleIs("(29) Portal"));
        Assert.assertEquals("Dashboard title verification is failed", "(29) Portal", Driver.getDriver().getTitle());
    }
    @When("User should be able to click MESSAGE tab")
    public void userShouldBeAbleToClickMESSAGETab() {
        element.messageBtn.click();

    }
    @When("User should be able to cancel message by clicking cancel button")
    public void user_should_be_able_to_cancel_message_by_clicking_cancel_button() {
        element.cancelBtn.click();
    }

    @When("User send message by clicking MESSAGE tab")
    public void userSendMessageByClickingMESSAGETab() {
        element.messageBtn.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.cssSelector("iframe.bx-editor-iframe")));
        element.boxMsg.sendKeys("HELO WORLD - HELLO WORLD");
        Driver.getDriver().switchTo().defaultContent();

    }


    @When("User should be able to attach link by clicking on the link icon")
    public void user_should_be_able_to_attach_link_by_clicking_on_the_link_icon() {
        element.linkBtn.click();

    }
    @When("User should be able to click cancel button")
    public void user_should_be_able_to_click_cancel_button() {
        element.linkCancel.click();
        element.sendBtn.click();
    }

    @Then("User should see their message on tap of the page")
    public void user_should_see_their_message_on_tap_of_the_page() {
        wait.until(ExpectedConditions.textToBePresentInElement(element.textAppear, "HELO WORLD - HELLO WORLD"));
        String actualText = element.textAppear.getText();
        String expectedText = "HELO WORLD - HELLO WORLD";
       Assert.assertEquals("Send message verification is failed", expectedText, actualText);
    }

}
