package com.nuwebgroup.admin.cucumber.stepdefs;

import com.nuwebgroup.admin.pages.HomePage;
import com.nuwebgroup.admin.pages.ReportsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by Pradip
 */
public class CheckAndDownloadReportTest {
    @Given("^User click on Reports feature$")
    public void userClickOnReportsFeature() {
        new HomePage().scrollDown();
        new HomePage().clickOnReportsFeature();

    }

    @And("^User click on Company sales report feature$")
    public void userClickOnCompanySalesReportFeature() {
        new ReportsPage().clickOnCompanySalesReportFeature();

    }

    @And("^User Click on Download as feature to download XLSX Report$")
    public void userClickOnDownloadAsFeatureToDownloadXLSXReport() {
        new ReportsPage().clickOnDownloadAsFeature();

    }

    @And("^User click on Download as feature to download CSV Report$")
    public void userClickOnDownloadAsFeatureToDownloadCSVReport() {
        new ReportsPage().clickOnDownloadAsCsvReport();
    }


    @And("^User click on Download as feature to download TSV Report$")
    public void userClickOnDownloadAsFeatureToDownloadTSVReport() {
        new ReportsPage().clickOnDownloadAsTsvReport();
    }

    @And("^User click on Download as feature to download ODS Report$")
    public void userClickOnDownloadAsFeatureToDownloadODSReport() {
        new ReportsPage().clickOnDownloadAsOdsReport();
    }

    @And("^User click on Download as feature to download XLS Report$")
    public void userClickOnDownloadAsFeatureToDownloadXLSReport() {
        new ReportsPage().clickOnDownloadAsXlsReport();
    }

    @And("^User click on Download as feature to download HTML Report$")
    public void userClickOnDownloadAsFeatureToDownloadHTMLReport() {
        new ReportsPage().clickOnDownloadAsHtmlReport();
    }

    @Then("^User should download Reports successfully$")
    public void userShouldDownloadReportsSuccessfully() {
        Assert.assertEquals(new ReportsPage().getReportDownloadText(),"Download as\n" +
                " XLSX\n" +
                "CSV\n" +
                "TSV\n" +
                "ODS\n" +
                "XLS\n" +
                "HTML");
    }
}
