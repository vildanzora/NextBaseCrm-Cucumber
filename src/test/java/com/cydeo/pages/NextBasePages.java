package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBasePages {
    public NextBasePages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']" )
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']" )
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement logInBtn;

    @FindBy(xpath = "//input[@id='USER_REMEMBER']" )
    public WebElement rememberCheckBox;

    @FindBy(xpath = "//*[@id=\"login-popup\"]/form/div[2]/a" )
    public WebElement forgotPasswordLink;

    public void login(String username, String password) {
        inputUserName.sendKeys(username);
        inputPassword.sendKeys(password);
    }

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]" )
    public WebElement messageBtn;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-cancel\"]" )
    public WebElement cancelBtn;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span" )
    public WebElement linkBtn;

    @FindBy(xpath = "//*[@id=\"linkidPostFormLHE_blogPostForm-href\"]")
    public WebElement inputLink;

    @FindBy(xpath = "//*[@id=\"undefined\"]" )
    public WebElement saveBtn;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]" )
    public WebElement sendBtn;

    @FindBy(xpath = "//*[@id=\"cancel\"]")
    public WebElement linkCancel;

    @FindBy(xpath = "//*[@id=\"blog_post_body_1592\"]")
   public WebElement messageArea;

@FindBy(tagName = "body")
    public WebElement boxMsg;

@FindBy(xpath = "//div[starts-with(@id, 'blog_post_body')]" )
   public WebElement textAppear;


@FindBy(xpath = "//div[@class='title-search-result title-search-result-header search-title-top-result-header']" )
    public WebElement suggestedMenu;

@FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollBtn;

    @FindBy(tagName = "body" )
    public WebElement pollMesageBox;

    @FindBy(xpath = "//*[@id=\"question_0\"]")
    public WebElement writeQuestion;

    @FindBy(xpath = "//*[@id=\"answer_0__0_\"]")
    public WebElement answer1;

    @FindBy(xpath = "//*[@id=\"answer_0__1_\"]")
    public WebElement answer2;

    @FindBy(xpath = "//*[@id=\"multi_0\"]")
    public WebElement allowMultiple;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public  WebElement pollSave;

    @FindBy(xpath = "//span[@class='bx-vote-block-inp-substitute']")
    public WebElement vote1;

    @FindBy(xpath = "(//span[@class='bx-vote-block-inp-substitute'])[2]")
    public WebElement vote2;

    @FindBy(xpath = "//button[@data-bx-vote-button='actVoting']")
    public WebElement voteBtn;

    @FindBy(xpath = "//button[@data-bx-vote-button='showVoteForm']")
    public  WebElement voteAgain;

    @FindBy(xpath = "//button[.='Stop']")
    public  WebElement stopVote;











}
