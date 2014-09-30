package com.fuzzpro.tests.webdrivers;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


/**
 * Created by kayodeatobatele on 9/22/14.
 */
public class SignInRegisterTest {


    private SignInRegister page;
    private RegisterNewAccount newAccountPage;
    private ForgotPassword forgotPage;
    private WebDriver driver;
    private String urlForPageUnderTest;
    private  Promotions promoPage;


    @Before

    public void setUp() throws Exception {
        // Create a new instance of a driver


        this.driver  = new FirefoxDriver();

        // Navigate to the right place

        urlForPageUnderTest = "https://www.belk.com/AST/Misc/Belk_Stores/Global_Navigation/Sign_In_Register.jsp";
        //urlForPageUnderTest = "http://www.belk.com/AST/Featured/Promo_Details/Email/Signup.jsp";
        driver.get(urlForPageUnderTest);


        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        this.page = PageFactory.initElements(driver, SignInRegister.class);

        this.newAccountPage = PageFactory.initElements(driver, RegisterNewAccount.class);

        this.forgotPage = PageFactory.initElements(driver, ForgotPassword.class);
        this.promoPage = PageFactory.initElements(driver, Promotions.class);

    }

    @Test
    public void createNewAccount() {
    //Create a New user account
        page.selectNewAccount();
        newAccountPage.enterEmailAddress("katobatele@fuzzpro.com");
        newAccountPage.enterPassword("Letmein");
        newAccountPage.confirmPassword("Letmein");
        //newAccountPage.createNewAccount();

}
    @Test
    public void existingAccountSignIn() {

        // Existing account sign in.

        page.enterEmailAddress("katobatele@fuzzpro.com");
        page.enterPassword("letmein");
        page.clickSignInButton();

       // System.out.println("Test 2");
    }
    @Test
    public void forgotPassword () {

        // Forgot password

        page.clickForgotPasswordLink();
        forgotPage.enterEmailAddress("katobatele@fuzzpro.com");
        forgotPage.confirmEmail("katobatele@fuzzpro.com");
        forgotPage.sendPasswordClick();

    }
    @Test
    public void signUpPromotionalEmails () {

        // Promotions

        page.payBelkCredit();
       // page.signUpPromotionalEmails();
        //driver.get("http://www.belk.com/AST/Featured/Promo_Details/Email/Signup.jsp");


        //promoPage.enterEmailAddress("katobatele@fuzzpro.com");
       // promoPage.confirmEmail("katobatele@fuzzpro.com");
        //promoPage.sendPasswordClick();
        //promoPage.divisionClick();
        //promoPage.privacyPolicyLink();



    System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //List<WebElement>[] webList = driver.findElements(By.id("email"));
       





    }



    @After
    public void tearDown(){



        driver.close();
        driver.quit();

    }


    }


