package com.fuzzpro.tests.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kayodeatobatele on 9/26/14.
 */
public class HomePage {

    @FindBy(how = How.XPATH, using = "")
    private WebElement someLink;

    private WebDriver driver;


}
