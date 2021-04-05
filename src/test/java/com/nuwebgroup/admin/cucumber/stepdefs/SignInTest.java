package com.nuwebgroup.admin.cucumber.stepdefs;

import com.nuwebgroup.admin.pages.HomePage;
import com.nuwebgroup.admin.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class SignInTest {
    @Given("^User is on nu web group home page$")
    public void userIsOnNuWebGroupHomePage() {
    }

    @And("^User click on sign in feature$")
    public void userClickOnSignInFeature() {
        new HomePage().clickOnSignInFeature();
    }

    @And("^User Enter Email address on Email field \"([^\"]*)\"$")
    public void userEnterEmailAddressOnEmailField(String emailAddress)  {
        new LoginPage().enterEmailAddress(emailAddress);


    }

    @And("^User Enter Password on Password field \"([^\"]*)\"$")
    public void userEnterPasswordOnPasswordField(String password)  {
        new LoginPage().enterPassword(password);

    }

    @When("^User click on Sign In button$")
    public void userClickOnSignInButton() {
        new LoginPage().clickOnSignInButton();
    }

    @Then("^User should Sign In successfully$")
    public void userShouldSignInSuccessfully() {
        Assert.assertEquals(new HomePage().getWelcomeMessage(),"Welcome, Pradip Dhanani");
    }

    @Then("^User should not Sign In to system and shows Error message \"([^\"]*)\"$")
    public void userShouldNotSignInToSystemAndShowsErrorMessage(String errorMessage)  {
        Assert.assertEquals(new LoginPage().getSignInErrorMessage(),errorMessage);

    }
}
