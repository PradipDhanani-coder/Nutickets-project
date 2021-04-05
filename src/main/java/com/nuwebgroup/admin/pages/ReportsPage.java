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
public class ReportsPage extends Utility {
    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(ReportsPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//a[contains(text(),'Company sales report')]")
    WebElement _companySalesReport;

    @FindBy(css = "select[class='form-select block mx-3']")
    WebElement _downloadAsFeature;


    /**
     * Method created to do actions on each web element
     */


    public void clickOnCompanySalesReportFeature() {
        Reporter.addStepLog("Clicking on Company Sales Report Feature" + _companySalesReport.toString());
        clickOnElement(_companySalesReport);
        log.info("Clicking on Company Sales Report Feature" + _companySalesReport.toString());
    }


    public void clickOnDownloadAsFeature() {
        Reporter.addStepLog("Clicking On Download As Feature" + _downloadAsFeature.toString());
        clickOnElement(_downloadAsFeature);
        selectByValueFromDropDownMenu(_downloadAsFeature, "xlsx");
        log.info("Clicking On Download As Feature" + _downloadAsFeature.toString());


    }

    public void clickOnDownloadAsCsvReport() {
        Reporter.addStepLog("Clicking On Download As Feature" + _downloadAsFeature.toString());
        clickOnElement(_downloadAsFeature);
        selectByValueFromDropDownMenu(_downloadAsFeature, "csv");
        log.info("Clicking On Download As Feature" + _downloadAsFeature.toString());
    }

    public void clickOnDownloadAsTsvReport() {
        Reporter.addStepLog("Clicking On Download As Feature" + _downloadAsFeature.toString());
        clickOnElement(_downloadAsFeature);
        selectByValueFromDropDownMenu(_downloadAsFeature, "tsv");
        log.info("Clicking On Download As Feature" + _downloadAsFeature.toString());


    }

    public void clickOnDownloadAsOdsReport() {
        Reporter.addStepLog("Clicking On Download As Feature" + _downloadAsFeature.toString());
        clickOnElement(_downloadAsFeature);
        selectByValueFromDropDownMenu(_downloadAsFeature, "ods");
        log.info("Clicking On Download As Feature" + _downloadAsFeature.toString());


    }

    public void clickOnDownloadAsXlsReport() {
        Reporter.addStepLog("Clicking On Download As Feature" + _downloadAsFeature.toString());
        clickOnElement(_downloadAsFeature);
        selectByValueFromDropDownMenu(_downloadAsFeature, "xls");
        log.info("Clicking On Download As Feature" + _downloadAsFeature.toString());


    }

    public void clickOnDownloadAsHtmlReport() {
        Reporter.addStepLog("Clicking On Download As Feature" + _downloadAsFeature.toString());
        clickOnElement(_downloadAsFeature);
        selectByValueFromDropDownMenu(_downloadAsFeature, "html");
        log.info("Clicking On Download As Feature" + _downloadAsFeature.toString());


    }

    public String getReportDownloadText() {
        Reporter.addStepLog("Getting Report Download Text" + _downloadAsFeature.toString());
        log.info("Getting Report Download Text" + _downloadAsFeature.toString());
        return getTextFromElement(_downloadAsFeature);
    }

}
