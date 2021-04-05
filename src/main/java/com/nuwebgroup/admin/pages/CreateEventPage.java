package com.nuwebgroup.admin.pages;

import com.cucumber.listener.Reporter;
import com.nuwebgroup.admin.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Pradip
 */
public class CreateEventPage extends Utility {
    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(CreateEventPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[4]/input[1]")
    WebElement _eventNameField;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]")
    WebElement _evenDescriptionField;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement _nextFeature;

    @FindBy(xpath = "//span[contains(text(),'Select existing venue')]")
    WebElement _venueFeature;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/span[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement _venueSelectFromDropDownMenu;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[4]/label[1]/span[4]/div[1]/div[1]/div[1]/span[2]/input[1]")
    WebElement _startDateFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[4]/label[1]/span[4]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement _startTimeFeature;


    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[4]/label[1]/span[4]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement _endTimeFeature;


    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement _nextButtonFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[4]/input[1]")
    WebElement _ticketNameFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]")
    WebElement _ticketDescriptionFeature;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement _nextBtnFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/div[1]/label[1]/span[1]/span[2]")
    WebElement _pricingGbpFeature;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[4]/div[1]/div[1]/input[1]")
    WebElement _basePriceFeature;

    @FindBy(xpath = "//button[contains(text(),'Preview event')]")
    WebElement _previewEventFeature;

    @FindBy(xpath = "//button[contains(text(),'Save & publish')]")
    WebElement _saveAndPublishFeature;

    @FindBy(xpath = "//p[contains(text(),'The selected event(s) were published successfully')]")
    WebElement _getEventPublishedTextMessage;

    @FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > main:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > label:nth-child(1) > span:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > svg:nth-child(1)")
    WebElement _totalStockAvailable;


    /**
     * Method created to do actions on each web element
     */

    public void enterEventName(String eventName) {
        Reporter.addStepLog("Enter Event Name " + eventName + "On Event Name Field " + _eventNameField.toString());
        sendTextToElement(_eventNameField, eventName);
        log.info("Enter Event Name " + eventName + "On Event Name Field " + _eventNameField.toString());
    }

    public void enterEventDescription(String eventDescription) {
        Reporter.addStepLog("Enter Event Description " + eventDescription + "On Event Description Field " + _evenDescriptionField.toString());
        sendTextToElement(_evenDescriptionField, eventDescription);
        log.info("Enter Event Description " + eventDescription + "On Event Description Field " + _evenDescriptionField.toString());
    }

    public void clickOnNextButton() {
        Reporter.addStepLog("Clicking on Next Button" + _nextFeature.toString());
        clickOnElement(_nextFeature);
        log.info("Clicking on Next Button" + _nextFeature.toString());

    }

    public void clickOnVenueButton() {
        Reporter.addStepLog("Clicking on Venue Button" + _venueFeature.toString());
        clickOnElement(_venueFeature);
        log.info("Clicking on Venue Button" + _venueFeature.toString());

    }

    public void selectVenueFromDropDownMenu() {
        Reporter.addStepLog("Select Venue From Drop Down Menu" + _venueSelectFromDropDownMenu.toString());
        clickOnElement(_venueSelectFromDropDownMenu);
        log.info("Select Venue From Drop Down Menu" + _venueSelectFromDropDownMenu.toString());

    }


    public void clickOnNextButtonFeature() {
        Reporter.addStepLog("Clicking on Next Button Feature" + _nextButtonFeature.toString());
        clickOnElement(_nextButtonFeature);
        log.info("Clicking on Next Button Feature" + _nextButtonFeature.toString());

    }

    public void enterStartDate(String startDate) {
        clearTextFromField(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[4]/label[1]/span[4]/div[1]/div[1]/div[1]/span[2]/input[1]"));
        Reporter.addStepLog("Enter Start Date" + startDate + "On Start Date Field " + _startDateFeature.toString());
        sendTextToElement(_startDateFeature, startDate);
        log.info("Enter Start Date" + startDate + "On Start Date Field " + _startDateFeature.toString());
    }

    public void enterStartTime(String startTime) {
        Reporter.addStepLog("Enter Start Time" + startTime + "On Start Time Field " + _startTimeFeature.toString());
        sendTextToElement(_startTimeFeature, startTime);
        log.info("Enter Start Time" + startTime + "On Start Time " + _startTimeFeature.toString());
    }

    public void enterEndTime(String endTime) {
        Reporter.addStepLog("Enter End Time" + endTime + "On End Time Field " + _endTimeFeature.toString());
        sendTextToElement(_endTimeFeature, endTime);
        log.info("Enter End Time" + endTime + "On End Time " + _endTimeFeature.toString());
    }

    public void enterTicketName(String ticketName) {
        Reporter.addStepLog("Enter Ticket Name " + ticketName + "On Ticket Name Field " + _ticketNameFeature.toString());
        sendTextToElement(_ticketNameFeature, ticketName);
        log.info("Enter Ticket Name " + ticketName + "On Ticket Name Field " + _ticketNameFeature.toString());
    }

    public void enterTicketDescription(String ticketDescription) {
        Reporter.addStepLog("Enter Ticket Description" + ticketDescription + "On Ticket Description Field " + _ticketDescriptionFeature.toString());
        sendTextToElement(_ticketDescriptionFeature, ticketDescription);
        log.info("Enter Ticket Description" + ticketDescription + "On Ticket Description Field " + _ticketDescriptionFeature.toString());
    }

    public void clickOnTotalStockAvailableFeature() {
        Reporter.addStepLog("Clicking on Total Stock Available Feature" + _totalStockAvailable.toString());
        waitUntilElementToBeClickable(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > main:nth-child(3) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > label:nth-child(1) > span:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1) > svg:nth-child(1)"), 20);
        clickOnElement(_totalStockAvailable);
        log.info("Clicking on Total Stock Available Feature" + _totalStockAvailable.toString());

    }


    public void clickOnNextBtnFeature() {
        Reporter.addStepLog("Clicking on Next Button Feature" + _nextBtnFeature.toString());
        clickOnElement(_nextBtnFeature);
        log.info("Clicking on Next Button Feature" + _nextBtnFeature.toString());

    }

    public void clickOnPricingGbpButton() {
        Reporter.addStepLog("Clicking on Pricing GBP Button" + _pricingGbpFeature.toString());
        clickOnElement(_pricingGbpFeature);
        log.info("Clicking on Pricing GBP Button" + _pricingGbpFeature.toString());

    }

    public void enterBasePrice(String basePrice) {
        clearTextFromField(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[4]/div[1]/div[1]/input[1]"));
        clearTextFromField(By.xpath("//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[4]/div[1]/div[1]/input[1]"));
        Reporter.addStepLog("Enter Base Price" + basePrice + "On Base Price Field " + _basePriceFeature.toString());
        sendTextToElement(_basePriceFeature, basePrice);
        log.info("Enter Base Price" + basePrice + "On Base Price Field " + _basePriceFeature.toString());
    }

    public void clickOnPreviewEvent() {
        Reporter.addStepLog("Clicking on Preview Event feature" + _previewEventFeature.toString());
        clickOnElement(_previewEventFeature);
        log.info("Preview Event feature" + _previewEventFeature.toString());

    }

    public void clickOnSaveAndPublishFeature() {
        Reporter.addStepLog("Clicking on Save And Publish feature" + _saveAndPublishFeature.toString());
        clickOnElement(_saveAndPublishFeature);
        log.info("Clicking on Save And Publish feature" + _saveAndPublishFeature.toString());

    }

    public String getTextMessageEventPublishedSuccessfully() {
        Reporter.addStepLog("Getting text message event were published successfully" + _getEventPublishedTextMessage.toString());
        log.info("Getting text message event were published successfully" + _getEventPublishedTextMessage.toString());
        return getTextFromElement(_getEventPublishedTextMessage);

    }
}
