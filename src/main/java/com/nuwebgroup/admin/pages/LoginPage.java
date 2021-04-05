package com.nuwebgroup.admin.pages;

import com.cucumber.listener.Reporter;
import com.nuwebgroup.admin.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Pradip
 */
public class LoginPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//input[@id='email']")
    WebElement _emailAddressField;

    @FindBy(xpath = "//input[@id='password']")
    WebElement _passwordField;

    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    WebElement _signInButton;

    @FindBy(xpath = "//p[contains(text(),'These credentials do not match our records.')]")
    WebElement _getSignInErrorMessage;


    /**
     * Method created to do actions on each web element
     */
    public void enterEmailAddress(String emailAddress) {
        Reporter.addStepLog("Enter Email address " + emailAddress + "On Email address Field " + _emailAddressField.toString());
        sendTextToElement(_emailAddressField, emailAddress);
        log.info("Enter Email address " + emailAddress + "On Email address Field " + _emailAddressField.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter password " + password + "On Password Field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Enter password " + password + "On Password Field " + _passwordField.toString());
    }

    public void clickOnSignInButton() {
        Reporter.addStepLog("Clicking on Sign in button " + _signInButton.toString());
        clickOnElement(_signInButton);
        log.info("Clicking on Sign in button " + _signInButton.toString());
    }

    public String getSignInErrorMessage() {
        Reporter.addStepLog("Getting Sign In Error Message" + _getSignInErrorMessage.toString());
        log.info("Getting Sign In Error Message" + _getSignInErrorMessage.toString());
        return getTextFromElement(_getSignInErrorMessage);
    }


}
