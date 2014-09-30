package com.fuzzpro.tests.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

/**
 * Created by kayodeatobatele on 9/25/14.
 */
public class BelkRewardsCard {


    @FindBy(how = How.NAME, using = "userId")
    private WebElement userName;

   // @FindBy(how = How.XPATH, using = ".//*[@id='confirmEmail']")
   // private WebElement emailConfirm;

    //@FindBy(how = How.CLASS_NAME, using = "sPswd")
    //private WebElement btnSendPassword;


    public BelkRewardsCard enterUserName(String userNameStr){

        userName.sendKeys(userNameStr);
        return this;
    }
}
