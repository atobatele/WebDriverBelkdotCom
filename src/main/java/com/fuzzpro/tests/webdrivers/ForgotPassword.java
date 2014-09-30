package com.fuzzpro.tests.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;


/**
 * Created by kayodeatobatele on 9/23/14.
 */
public class ForgotPassword {


    @FindBy(how = How.XPATH, using = ".//*[@id='userid_email']")
    private WebElement emailAddress;

    @FindBy(how = How.XPATH, using = ".//*[@id='confirmEmail']")
    private WebElement emailConfirm;

    @FindBy(how = How.CLASS_NAME, using = "sPswd")
    private WebElement btnSendPassword;


    public ForgotPassword enterEmailAddress(String emailaddr){

        emailAddress.sendKeys(emailaddr);

        return this;
    }

    public ForgotPassword confirmEmail(String emailaddr){

        emailConfirm.sendKeys(emailaddr);

        return this;

    }

    public void sendPasswordClick() {

        btnSendPassword.click();
    }



}
