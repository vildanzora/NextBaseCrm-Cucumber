package com.cydeo.step_definitions;

import com.cydeo.pages.Base;
import com.cydeo.pages.NextBasePages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NextBase_Login{
    NextBasePages pages = new NextBasePages();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 300);

    @Given("User on Next Base CRM Log in page")
    public void user_on_next_base_crm_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("User should be able to access FORGOT YOUR PASSWORD? link page")
    public void user_should_be_able_to_access_forgot_your_password_link_page() {
        pages.forgotPasswordLink.click();
        Driver.getDriver().navigate().back();
    }
    @When("User should be able to log in with valid {string} and valid {string}")
    public void user_should_be_able_to_log_in_with_valid_and_valid(String username, String password) {
        pages.login(username,password);

    }
    @When("User should be able to check Remember me on this computer option")
    public void user_should_be_able_to_check_remember_me_on_this_computer_option() {
       pages.rememberCheckBox.click();
    }
    @When("User should be able to click log in button")
    public void user_should_be_able_to_click_log_in_button() {
        pages.logInBtn.click();
    }
    @Then("User should be able to see dashboard")
    public void user_should_be_able_to_see_dashboard() {
        wait.until(ExpectedConditions.titleIs("(29) Portal"));
        Assert.assertEquals("Dashboard title verification is failed", "(29) Portal", Driver.getDriver().getTitle());
    }

}
