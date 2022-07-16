//package com.cydeo.step_definitions;
//
//import com.cydeo.pages.Base;
//import com.cydeo.pages.ClockStory;
//import com.cydeo.utilities.BrowserUtils;
//import com.cydeo.utilities.Driver;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class User_Story_6 extends Base {
//    @Override
//    public void setUp() {
//        super.setUp();
//    }
//
//    ClockStory element = new ClockStory();
//    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),3000);
//    Actions actions = new Actions(Driver.getDriver());
//
//
//    @When("User should be able to click clock")
//    public void user_should_be_able_to_click_clock() {
//        element.clock.click();
//    }
//
//    @Then("User should be able to click edit button")
//    public void user_should_be_able_to_click_edit_button() throws InterruptedException {
//        wait.until(ExpectedConditions.visibilityOf(element.edit));
//        element.edit.click();
//    }
//
//    @Then("User should be able to select start - end time, write reason and click save button")
//    public void user_should_be_able_to_select_start_end_time_write_reason_and_click_save_button() throws InterruptedException {
//        BrowserUtils.waitForClickablility(element.startHours,10);
//
//        actions.moveToElement(element.startHours).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.startHours.sendKeys( "11");
//
//        actions.moveToElement(element.startMin).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.startMin.sendKeys("30");
//
//        actions.moveToElement(element.endHours).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.endHours.sendKeys("5");
//
//        actions.moveToElement(element.endMin).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.endMin.sendKeys("45");
//
//        element.amPm.click();
//        element.saveBtn.click();
//        wait.until(ExpectedConditions.visibilityOfAllElements(element.reason));
//        element.reason.sendKeys("work");
//        wait.until(ExpectedConditions.elementToBeClickable(element.saveBtn));
//        Thread.sleep(2000);
//        element.saveBtn.click();
//        Thread.sleep(2000);
//
//
//    }
//    @Then("User should be able to click Clock In button")
//    public void user_should_be_able_to_click_clock_in_button() throws InterruptedException {
//        element.clockIn.click();
//        Thread.sleep(2000);
//
//    }
//    @Then("User should be able to click Clock Out button")
//    public void user_should_be_able_to_click_clock_out_button() {
//        element.clockOut.click();
//
//    }
//    @Then("User should be able to enter a new daily plan task")
//    public void user_should_be_able_to_enter_a_new_daily_plan_task() {
//        element.addTask.sendKeys("Call Customer");
//        element.submitTask.click();
//
//    }
//
//    @Then("User should be able to add event")
//    public void user_should_be_able_to_add_event() {
//
//        element.eventStartTime.click();
//        actions.moveToElement(element.eventStartHour).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.eventStartHour.sendKeys("9");
//
//        actions.moveToElement(element.eventStartMin).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.eventStartMin.sendKeys("30");
//        element.eventStartSelect.click();
//
//        element.eventEndTime.click();
//        actions.moveToElement(element.eventEndHour).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.eventEndHour.sendKeys("10");
//
//        actions.moveToElement(element.eventEndMin).doubleClick().sendKeys(Keys.BACK_SPACE).perform();
//        element.eventEndMin.sendKeys("30");
//        element.eventEndSelect.click();
//
//        element.eventDef.sendKeys("Doctor");
//        element.eventSubmit.click();
//
//        element.clock.click();
//
//
//    }
//
//}
