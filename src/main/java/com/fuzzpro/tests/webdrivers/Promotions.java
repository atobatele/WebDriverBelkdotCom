package com.fuzzpro.tests.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by kayodeatobatele on 9/24/14.
 */
public class Promotions {
/*
    @FindBy(how = How.XPATH, using = ".//*[@id='email_address']")

    private WebElement emailAddress;

    @FindBy(how = How.XPATH, using = ".//*[@id='email_address_confirm']")
    private WebElement confirmEmailAddress;

    @FindBy(how = How.XPATH, using = ".//*[@id='emailform']/div[2]/input")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='filter_and_sort']/label")
    private WebElement label;

    @FindBy(how = How.XPATH, using = ".//*[@id='content']/div[2]/p[2]/a")
    private WebElement privacyPolicyLink;
    */

    @FindBy(how = How.CLASS_NAME, using = "accountDiv")
    private WebElement div;



/*

    public Promotions enterEmailAddress(String emailaddr){

        emailAddress.sendKeys(emailaddr);

        return this;
    }

    public Promotions confirmEmail(String emailaddr){

        confirmEmailAddress.sendKeys(emailaddr);

        return this;

    }

    public void sendPasswordClick() {

        signInButton.click();
    }

    public void labelClick(){

        label.click();

    }

    public void privacyPolicyLink(){

        privacyPolicyLink.click();

    }

    */

    public void divisionClick(){

        div.click();
    }
}
