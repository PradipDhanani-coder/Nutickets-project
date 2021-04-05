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
public class UsersPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(UsersPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//span[contains(text(),'Add user')]")
    WebElement _addUserFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]/span[4]/input[1]")
    WebElement _createUserName;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/span[4]/input[1]")
    WebElement _createUserEmail;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/label[1]/span[4]/input[1]")
    WebElement _createUserPassword;

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement _createUserSubmitBtn;

    @FindBy(xpath = "//p[contains(text(),'User was created successfully')]")
    WebElement _getUserCreatedTextMessage;


    /**
     * Method created to do actions on each web element
     */

    public void clickOnAddUserFeature() {
        Reporter.addStepLog("Clicking On Add User Feature" + _addUserFeature.toString());
        clickOnElement(_addUserFeature);
        log.info("Clicking On Add User Feature" + _addUserFeature.toString());


    }

    public void enterName(String name) {
        Reporter.addStepLog("Enter Name" + name + "On Name Field " + _createUserName.toString());
        sendTextToElement(_createUserName, name);
        log.info("Enter Name" + name + "On Name Field" + name + _createUserName.toString());
    }

    public void enterEmail(String email) {
        Reporter.addStepLog("Enter Email" + email + "On Email Field " + _createUserEmail.toString());
        sendTextToElement(_createUserEmail, email);
        log.info("Enter Email" + email + "On Email Field" + email + _createUserEmail.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter Password" + password + "On Password Field " + _createUserPassword.toString());
        sendTextToElement(_createUserPassword, password);
        log.info("Enter Password" + password + "On Password Field" + password + _createUserPassword.toString());
    }


    public void clickOnCreateUserSubmitFeature() {
        Reporter.addStepLog("Clicking On Create User Submit Feature" + _createUserSubmitBtn.toString());
        clickOnElement(_createUserSubmitBtn);
        log.info("Clicking On Create User Submit Feature" + _createUserSubmitBtn.toString());


    }

    public String getUserCreatedTextMessage() {
        Reporter.addStepLog("Getting User Created Text Message" + _getUserCreatedTextMessage.toString());
        log.info("Getting User Created Text Message" + _getUserCreatedTextMessage.toString());
        return getTextFromElement(_getUserCreatedTextMessage);

    }


}
