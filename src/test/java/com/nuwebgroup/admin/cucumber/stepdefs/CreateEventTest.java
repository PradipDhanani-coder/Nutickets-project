package com.nuwebgroup.admin.cucumber.stepdefs;

import com.nuwebgroup.admin.pages.CreateEventPage;
import com.nuwebgroup.admin.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class CreateEventTest {


    @And("^User click on Add new event feature$")
    public void userClickOnAddNewEventFeature() {
        new HomePage().clickOnAddNewEventFeature();
    }


    @And("^User enter event name on event name field \"([^\"]*)\"$")
    public void userEnterEventNameOnEventNameField(String eventName) {
        new CreateEventPage().enterEventName(eventName);

    }

    @And("^User enter event description on event description field \"([^\"]*)\"$")
    public void userEnterEventDescriptionOnEventDescriptionField(String eventDescription) {
        new CreateEventPage().enterEventDescription(eventDescription);

    }

    @And("^User click on next button$")
    public void userClickOnNextButton() {
        new CreateEventPage().clickOnNextButton();
    }


    @And("^User click on Venue$")
    public void userClickOnVenue() {
        new CreateEventPage().clickOnVenueButton();
    }

    @And("^User select venue from select existing venue$")
    public void userSelectVenueFromSelectExistingVenue() {
        new CreateEventPage().selectVenueFromDropDownMenu();
    }


    @And("^User click on Next button feature$")
    public void userClickOnNextButtonFeature() {
        new CreateEventPage().clickOnNextButtonFeature();
    }


    @And("^User click on Start date calendar enter Start date \"([^\"]*)\"$")
    public void userClickOnStartDateCalendarEnterStartDate(String startDate) {
        new CreateEventPage().enterStartDate(startDate);

    }

    @And("^User click on Start time field and enter Start time \"([^\"]*)\"$")
    public void userClickOnStartTimeFieldAndEnterStartTime(String startTime) {
        new CreateEventPage().enterStartTime(startTime);

    }


    @And("^User click on End time field and enter End time \"([^\"]*)\"$")
    public void userClickOnEndTimeFieldAndEnterEndTime(String endTime) {
        new CreateEventPage().enterEndTime(endTime);

    }


    @And("^User Enter Ticket name on Ticket name field \"([^\"]*)\"$")
    public void userEnterTicketNameOnTicketNameField(String ticketName) {
        new CreateEventPage().enterTicketName(ticketName);

    }

    @And("^User Enter Ticket description on Ticket description field \"([^\"]*)\"$")
    public void userEnterTicketDescriptionOnTicketDescriptionField(String ticketDescription) {
        new CreateEventPage().enterTicketDescription(ticketDescription);

    }


    @And("^User click on Total stock available field$")
    public void userClickOnTotalStockAvailableField() {
        new CreateEventPage().clickOnTotalStockAvailableFeature();

    }

    @And("^User click on next btn$")
    public void userClickOnNextBtn() {
        new CreateEventPage().clickOnNextBtnFeature();
    }

    @And("^User click on Pricing GBP feature$")
    public void userClickOnPricingGBPFeature() {
        new CreateEventPage().clickOnPricingGbpButton();
    }

    @And("^User enter any Base price in Base price field \"([^\"]*)\"$")
    public void userEnterAnyBasePriceInBasePriceField(String basePrice)  {
        new CreateEventPage().enterBasePrice(basePrice);

    }

    @When("^User click on Preview event$")
    public void userClickOnPreviewEvent() {
        new CreateEventPage().clickOnPreviewEvent();
    }

    @And("^User click on save and publish button$")
    public void userClickOnSaveAndPublishButton() {
        new CreateEventPage().clickOnSaveAndPublishFeature();
    }

    @Then("^Event organiser should published event successfully$")
    public void eventOrganiserShouldPublishedEventSuccessfully() {
        Assert.assertEquals(new CreateEventPage().getTextMessageEventPublishedSuccessfully(),"The selected event(s) were published successfully");
    }
}
