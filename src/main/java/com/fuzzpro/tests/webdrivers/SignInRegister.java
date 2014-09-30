package com.fuzzpro.tests.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kayodeatobatele on 9/22/14.
 */
public class SignInRegister {
    // The element is now looked up using the name attribute,
    // and we never look it up once it has been used the first time
    @FindBy(how = How.XPATH, using = ".//*[@id='txt_email_address_n']")
    @CacheLookup
    private WebElement emailAddress;

    @FindBy(how = How.XPATH, using = ".//*[@id='txt_password_n']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = ".//*[@id='#signInButton']")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='userVerification']/fieldset/dl[2]/dd[1]/input")
    private WebElement createNewAccountRadiobutton;

    @FindBy(how = How.XPATH, using = ".//*[@id='forgot_Password']")
    private WebElement forgotPasswordURL;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Sign up for Belk promotional emails")
    private WebElement signUpPromtionLink;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Pay your Belk Rewards Credit Card")
    private WebElement payBelkCreditCardLink;

    @FindBy(how = How.XPATH, using = "")
    private WebElement someLink;

    private WebDriver driver;

    public SignInRegister enterEmailAddress(String email) {
        // We continue using the element just as before
        emailAddress.sendKeys(email);

        //emailAddress.submit();
        return this;
    }
    public SignInRegister enterPassword(String strPassword) {

        password.sendKeys(strPassword);

        return this;
    }

    public void clickSignInButton() {

        signInButton.click();
    }

    public RegisterNewAccount selectNewAccount() {

        createNewAccountRadiobutton.click();

        return PageFactory.initElements(driver, RegisterNewAccount.class);
    }

    public ForgotPassword clickForgotPasswordLink(){

        forgotPasswordURL.click();

        return PageFactory.initElements(driver,ForgotPassword.class);
    }
    //public Promotions signUpPromotionalEmails(){
    public void signUpPromotionalEmails(){

        signUpPromtionLink.click();

        //return PageFactory.initElements(driver, Promotions.class);

    }

    public BelkRewardsCard payBelkCredit(){

        payBelkCreditCardLink.click();
        
        return PageFactory.initElements(driver,BelkRewardsCard.class);

    }

}

