package com.cydeo.step_definitions;

import com.cydeo.pages.Base;
import com.cydeo.pages.NextBasePages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_Story_4_5 extends Base {
    @Override
    public void setUp() {
        super.setUp();
    }

    NextBasePages element = new NextBasePages();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3000);

    @When("User can write a poll message title with question & answer")
    public void user_can_write_a_poll_message_title_with_question_answer() {
        element.pollBtn.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.className("bx-editor-iframe")));
        element.pollMesageBox.sendKeys("Please answer it!");
        Driver.getDriver().switchTo().defaultContent();



    }
    @When("User should be able to check allow multiple Choice")
    public void user_should_be_able_to_check_allow_multiple_choice() {

        element.allowMultiple.click();

    }
    @When("User should be able to add questions")
    public void user_should_be_able_to_add_questions() {
        element.writeQuestion.sendKeys("Do you like new update");
        element.answer1.sendKeys("Yes, It is productive");
        element.answer2.sendKeys("I hate  it");

    }
    @Then("User should be able to cancel poll")
    public void user_should_be_able_to_cancel_poll() {
        element.pollSave.click();

    }

    @When("User can select an answer and vote for a poll.")
    public void user_can_select_an_answer_and_vote_for_a_poll() {
       // wait.until(ExpectedConditions.visibilityOf(element.vote1));
       // wait.until(ExpectedConditions.elementToBeClickable(element.vote2));
        element.vote1.click();
        element.vote2.click();
        element.voteBtn.click();

    }
    @When("User can vote agin")
    public void user_can_vote_agin() {
        element.voteAgain.click();

    }
    @Then("poll owner should be able to stop a poll")
    public void poll_owner_should_be_able_to_stop_a_poll() {
        element.stopVote.click();
    }


}
