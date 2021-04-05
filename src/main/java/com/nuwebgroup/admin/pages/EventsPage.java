package com.nuwebgroup.admin.pages;

import com.cucumber.listener.Reporter;
import com.nuwebgroup.admin.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Pradip
 */
public class EventsPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(EventsPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]/form[1]/span[1]/label[1]/div[1]/input[1]")
    WebElement _searchField;

    @FindBy(xpath = "//span[contains(text(),'Sample Event')]")
    WebElement _sampleEvent;

    @FindBy(xpath = "//span[contains(text(),'View event')]")
    WebElement _viewEventFeature;


    @FindBy(xpath = "//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]")
    WebElement _buyNowFeature;


    /**
     * Method created to do actions on each web element
     */

    public void enterEventNameOnSearchField(String searchField) {
        Reporter.addStepLog("Enter Event Name" + searchField + "On search Field " + _searchField.toString());
        sendTextToElement(_searchField, searchField);
        log.info("Enter Event Name" + searchField + "On search Field" + _searchField.toString());
    }

    public void clickOnSampleEvent() {
        Reporter.addStepLog("Clicking on Sample Event" + _sampleEvent.toString());
        clickOnElement(_sampleEvent);
        log.info("Clicking on Sample Event" + _sampleEvent.toString());
    }

    public void clickOnViewEvent() {
        Reporter.addStepLog("Clicking on View Event" + _viewEventFeature.toString());
        clickOnElement(_viewEventFeature);
        log.info("Clicking on View Event" + _viewEventFeature.toString());
    }

    public void clickOnBuyNowFeature() {
        Reporter.addStepLog("Clicking on Buy Now Feature" + _buyNowFeature.toString());
        driver.switchTo().window("https://pradip-dhanani.nuwebgroup.com:7443/events/1081");
        new WebDriverWait(driver, 10);
        clickOnElement(_buyNowFeature);
        log.info("Clicking on Buy Now Feature" + _buyNowFeature.toString());
    }

}
