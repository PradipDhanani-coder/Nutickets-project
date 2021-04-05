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

/**
 * Home page class extends to use properties and behaviour of utility class
 */
public class HomePage extends Utility {
    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement _signInFeature;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Pradip Dhanani')]")
    WebElement _getWelcomeText;

    @FindBy(xpath = "//span[contains(text(),'Add new event')]")
    WebElement _addNewEventFeature;

    @FindBy(xpath = "//dt[contains(text(),'Manage events')]")
    WebElement _manageEventsFeature;

    @FindBy(css = "div[class='mt-5 h-0 flex-1 flex flex-col overflow-y-auto'] div:nth-child(2) div:nth-child(1) span:nth-child(1) span:nth-child(1)")
    WebElement _eventsFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/a[1]")
    WebElement _attendanceFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement _ordersFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/div[1]/div[8]/a[1]")
    WebElement _reportsFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/nav[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement _manageUsersFeature;


    /**
     * Method created to do actions on each web element
     */
    public void clickOnSignInFeature() {
        Reporter.addStepLog("Clicking on Sign In Feature" + _signInFeature.toString());
        clickOnElement(_signInFeature);
        log.info("Clicking on Sign In Feature" + _signInFeature.toString());
    }

    public String getWelcomeMessage() {
        Reporter.addStepLog("Getting Welcome Message" + _getWelcomeText.toString());
        log.info("Getting Welcome Message" + _getWelcomeText.toString());
        return getTextFromElement(_getWelcomeText);
    }

    public void clickOnAddNewEventFeature() {
        Reporter.addStepLog("Clicking on Add New Event Feature" + _addNewEventFeature.toString());
        clickOnElement(_addNewEventFeature);
        log.info("Clicking on Add New Event Feature" + _addNewEventFeature.toString());

    }

    public void clickOnManageEventsFeature() {
        Reporter.addStepLog("Clicking on Manage Events Feature" + _manageEventsFeature.toString());
        clickOnElement(_manageEventsFeature);
        log.info("Clicking on Manage Events Feature" + _manageEventsFeature.toString());
    }

    public void clickOnEventFeature() {
        Reporter.addStepLog("Clicking Event Feature" + _eventsFeature.toString());
        clickOnElement(_eventsFeature);
        log.info("Clicking on Event Feature" + _eventsFeature.toString());

    }

    public void clickOnAttendanceFeature() {
        Reporter.addStepLog("Clicking Attendance Feature" + _attendanceFeature.toString());
        clickOnElement(_attendanceFeature);
        log.info("Clicking on Attendance Feature" + _attendanceFeature.toString());

    }

    public void clickOnOrdersFeature() {
        Reporter.addStepLog("Clicking on orders Feature" + _ordersFeature.toString());
        clickOnElement(_ordersFeature);
        log.info("Clicking on orders Feature" + _ordersFeature.toString());

    }

    public void scrollDown() {
        Reporter.addStepLog("scroll Down window ");
        windowScroll();
        log.info("scroll Down window ");
    }

    public void clickOnReportsFeature() {
        Reporter.addStepLog("Clicking on Reports Feature" + _reportsFeature.toString());
        clickOnElement(_reportsFeature);
        log.info("Clicking on Reports Feature" + _reportsFeature.toString());
    }

    public void clickOnManageUsersFeature() {
        Reporter.addStepLog("Clicking on Manage Users Feature" + _manageUsersFeature.toString());
        clickOnElement(_manageUsersFeature);
        log.info("Clicking on Manage Users Feature" + _manageUsersFeature.toString());
    }
}