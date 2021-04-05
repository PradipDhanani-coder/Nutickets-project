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
public class OrdersPage extends Utility {

    /**
     * logger to print logs
     */
    private static final Logger log = LogManager.getLogger(OrdersPage.class.getName());

    /**
     * Locators saved using page factory model for web elements
     */

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]/span[1]/span[2]")
    WebElement _customerOrdersReports;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]/span[1]")
    WebElement _getOrderRefTextMessage;


    /**
     * Method created to do actions on each web element
     */


    public void clickOnCustomerOrdersReport() {
        Reporter.addStepLog("Clicking on Customer Report" + _customerOrdersReports.toString());
        clickOnElement(_customerOrdersReports);
        log.info("Clicking on Customer Report" + _customerOrdersReports.toString());
    }

    public String getOrderReportMessage() {
        Reporter.addStepLog("Getting Customer Report" + _getOrderRefTextMessage.toString());
        log.info("Getting Customer Report" + _getOrderRefTextMessage.toString());
        return getTextFromElement(_getOrderRefTextMessage);

    }
}
