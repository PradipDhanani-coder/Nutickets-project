package com.nuwebgroup.admin.cucumber.stepdefs;
import static com.nuwebgroup.admin.utility.Utility.getRandomString;

import com.nuwebgroup.admin.pages.HomePage;
import com.nuwebgroup.admin.pages.UsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class NewUserRoleTest {
    String name = "jack" + getRandomString(5);
    String email = "jack" + getRandomString(5)+ "@hotmail.com";
    String password = "Peter1" + getRandomString(5);

    @When("^User click on Manage users feature$")
    public void userClickOnManageUsersFeature() {
        new HomePage().clickOnManageUsersFeature();

    }

    @And("^User click on Add user feature$")
    public void userClickOnAddUserFeature() {
        new UsersPage().clickOnAddUserFeature();
    }

    @And("^User enter Name on Name field$")
    public void userEnterNameOnNameField() {
        new UsersPage().enterName(name);
    }

    @And("^User enter Email on Email field$")
    public void userEnterEmailOnEmailField() {
        new UsersPage().enterEmail(email);
    }

    @And("^User enter Password on Password field$")
    public void userEnterPasswordOnPasswordField() {
        new UsersPage().enterPassword(password);
    }

    @And("^User click on submit Feature$")
    public void userClickOnSubmitFeature() {
        new UsersPage().clickOnCreateUserSubmitFeature();
    }

    @Then("^User should created successfully$")
    public void userShouldCreatedSuccessfully() {
        Assert.assertEquals(new UsersPage().getUserCreatedTextMessage(),"User was created successfully");
    }
}
