package com.fuzzpro.tests.webdrivers;


import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

/**
 * Created by kayodeatobatele on 9/23/14.
 */
public class RegisterNewAccount {

    @FindBy(how = How.XPATH, using = ".//*[@id='txt_email_address_r']")
    @CacheLookup
    private WebElement emailAddress;

    @FindBy(how = How.XPATH, using = ".//*[@id='txt_password_r']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = ".//*[@id='txt_password_cp']")
    private WebElement passwordConfirm;

    @FindBy(how = How.XPATH, using = ".//*[@id='registerUser']/p/button")
    private WebElement createAccountButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='login']/fieldset/dl[4]/dd[1]/input[3]")
    private WebElement newProdOptIn;



    public RegisterNewAccount enterEmailAddress(String email) {
        // We continue using the element just as before
        emailAddress.sendKeys(email);

        //emailAddress.submit();
        return this;
    }
    public RegisterNewAccount enterPassword(String strPassword) {

        password.sendKeys(strPassword);

        return this;
    }

    public void confirmPassword(String strPassword) {

        passwordConfirm.sendKeys(strPassword);
    }

    public void createNewAccount() {

        createAccountButton.click();
    }





}
