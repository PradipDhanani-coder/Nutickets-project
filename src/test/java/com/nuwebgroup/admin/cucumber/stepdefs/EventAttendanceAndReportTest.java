package com.nuwebgroup.admin.cucumber.stepdefs;

import com.nuwebgroup.admin.pages.HomePage;
import com.nuwebgroup.admin.pages.OrdersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class EventAttendanceAndReportTest {
    @And("^User click on Event Feature$")
    public void userClickOnEventFeature() {
        new HomePage().clickOnEventFeature();
    }

    @And("^User click on Attendance feature$")
    public void userClickOnAttendanceFeature() {
        new HomePage().clickOnAttendanceFeature();
    }

    @And("^User click on orders feature$")
    public void userClickOnOrdersFeature() {
        new HomePage().clickOnOrdersFeature();
    }

    @And("^User click on customer orders from given list of orders$")
    public void userClickOnCustomerOrdersFromGivenListOfOrders() {
        new OrdersPage().clickOnCustomerOrdersReport();
    }

    @Then("^User should see their order successfully$")
    public void userShouldSeeTheirOrderSuccessfully() {
        Assert.assertEquals(new OrdersPage().getOrderReportMessage(),"Order ref: MXPZ8YZ5N2");
    }
}
