package com.nuwebgroup.admin.cucumber.stepdefs;

import com.nuwebgroup.admin.pages.EventsPage;
import com.nuwebgroup.admin.pages.HomePage;
import cucumber.api.java.en.And;

/**
 * Created by Pradip
 */
public class BuyTicketsForEventsTest {
    @And("^User click on manage events feature$")
    public void userClickOnManageEventsFeature() {
        new HomePage().clickOnManageEventsFeature();
    }

    @And("^User Search Events by search field \"([^\"]*)\"$")
    public void userSearchEventsBySearchField(String searchEvent) {
        new EventsPage().enterEventNameOnSearchField(searchEvent);

    }

    @And("^User click on Sample Event$")
    public void userClickOnSampleEvent() {
        new EventsPage().clickOnSampleEvent();
    }

    @And("^User click on View event feature$")
    public void userClickOnViewEventFeature() {
        new EventsPage().clickOnViewEvent();
    }

    @And("^User click on Buy now feature$")
    public void userClickOnBuyNowFeature() {
        new EventsPage().clickOnBuyNowFeature();
    }


    @And("^User click on Sample Event from given list$")
    public void userClickOnSampleEventFromGivenList() {
        new EventsPage().clickOnSampleEvent();
    }
}
