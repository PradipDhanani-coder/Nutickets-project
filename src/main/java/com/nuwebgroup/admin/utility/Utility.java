package com.nuwebgroup.admin.utility;


import com.nuwebgroup.admin.basepage.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Pradip
 */

/**
 * Utility class is stored with reusable methods and extends with base page class to use
 * properties and behaviour of utility class
 */
public class Utility extends BasePage {
    WebElement elem;

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public void windowScroll() {
        elem = driver.findElement(By.tagName("html"));
        elem.sendKeys(Keys.END);

    }


    public void selectByValueFromDropDownMenu(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }


    /**
     * This method will clear previous stored data
     */
    public void clearTextFromField(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will return text from element
     */

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text to element
     */

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }


    /**
     * This method will used to wait web driver until element become clickable
     */
    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

}



