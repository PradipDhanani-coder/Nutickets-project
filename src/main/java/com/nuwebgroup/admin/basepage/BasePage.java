package com.nuwebgroup.admin.basepage;



/**
 * Created by Pradip
 */


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Web driver initialization to use in all other class
 */
public class BasePage {
    public static WebDriver driver;


    /**
     * Below constructor define with log4j.properties path
     */

    public BasePage() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/nuwebgroup/admin/resources/propertiesfile/log4j.properties");
    }

}
