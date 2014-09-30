package com.fuzzpro.tests.webdrivers;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by kayodeatobatele on 9/25/14.
 */
public class BelkRewardsTest {

    private  BelkRewardsCard belkRewardsCardPage;
    private  WebDriver driver;
    private String urlForPageUnderTest;

    @Before

    public void setUp() throws Exception {
        // Create a new instance of a driver


        this.driver  = new FirefoxDriver();

        // Navigate to the right place

        urlForPageUnderTest = "https://www.belkcredit.com/consumergen2/login.do?subActionId=1000&clientId=belk&langId=en&accountType=plcc";

        driver.get(urlForPageUnderTest);


        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        this.belkRewardsCardPage = PageFactory.initElements(driver, BelkRewardsCard.class);


    }

    @Test

    public void enterUserName(){

        belkRewardsCardPage.enterUserName("Katobatele");
       // assertThat("Tis tests the return of a page",(belkRewardsCardPage.enterUserName("Ka").equals(belkRewardsCardPage)));





    }

    @After
    public void tearDown(){



         driver.close();
         driver.quit();

    }

}
