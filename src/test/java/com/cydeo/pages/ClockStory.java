package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://login.nextbasecrm.com/stream/
public class ClockStory {
    @FindBy(xpath = "//table[@class='bx-layout-table']//tbody//span[@id='timeman-block']")
    public WebElement clock;

    @FindBy(xpath = "//span[@class='tm-popup-notice-pencil']")
    public WebElement edit;

    @FindBy(xpath = "//table[@class='tm-double-clock-table']//table[@class='bxc-cus-sel-tbl']//input[@title='Hours']")
    public WebElement startHours;

    @FindBy(xpath = "//table[@class='tm-double-clock-table']//table[@class='bxc-cus-sel-tbl']//input[@title='Minutes']")
    public WebElement startMin;

    @FindBy(xpath = "(//table[@class='tm-double-clock-table']//table[@class='bxc-cus-sel-tbl']//input[@title='Hours'])[2]")
    public WebElement endHours;


    @FindBy(xpath = "(//table[@class='tm-double-clock-table']//table[@class='bxc-cus-sel-tbl']//input[@title='Minutes'])[2]")
    public WebElement endMin;

    @FindBy(xpath = "(//table[@class='tm-double-clock-table']//span[@title='a.m.'])[2]")
    public WebElement amPm;

    @FindBy(xpath = "(//div[@class='bx-tm-popup-clock-wnd-report'])[2]")
    public WebElement clickReason;

    @FindBy(xpath = "//div[@class='bx-tm-popup-clock-wnd-report'][2]/textarea")
    public WebElement reason;

    @FindBy(xpath = "//div[@class='popup-window-buttons']//span")
    public WebElement saveBtn;

    @FindBy(xpath = "//span[@class='webform-small-button tm-popup-main-button webform-small-button-accept']")
    public WebElement continueWorkingDay;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement clockIn;

    @FindBy(xpath = "//span[@class='webform-small-button tm-popup-main-button webform-small-button-decline']")
    public WebElement clockOut;

    @FindBy(xpath = "//div[@class='tm-popup-task-form tm-popup-task-form-disabled']/input")
    public WebElement addTask;

    @FindBy(xpath = "//span[@class='tm-popup-task-form-submit']")
    public WebElement submitTask;


    @FindBy(xpath = "//div[@class='tm-popup-event-form tm-popup-event-form-disabled']/input")
    public WebElement eventStartTime;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//td[@rowspan='2']/input[@class='bxc-cus-sel'])[5]")
    public WebElement eventStartHour;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//td[@rowspan='2']/input[@class='bxc-cus-sel'])[6]")
    public WebElement eventStartMin;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement eventStartSelect;

    @FindBy(xpath = "(//div[@class='tm-popup-event-form tm-popup-event-form-disabled']/input)[2]")
    public WebElement eventEndTime;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//td[@rowspan='2']/input[@class='bxc-cus-sel'])[5]")
    public WebElement eventEndHour;

    @FindBy(xpath = "(//table[@class='bxc-cus-sel-tbl']//td[@rowspan='2']/input[@class='bxc-cus-sel'])[6]")
    public WebElement eventEndMin;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-create']")
    public WebElement eventEndSelect;



    @FindBy(xpath = "(//div[@class='tm-popup-event-form tm-popup-event-form-disabled']/input)[3]")
    public WebElement eventDef;

    @FindBy(xpath = "//span[@class='tm-popup-event-form-submit']")
    public WebElement eventSubmit;

















    // No page elements added

    public ClockStory() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}