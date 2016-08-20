package com.example.taf.utils;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

    private WebDriverUtils() {
    }

    public static WebDriver getWebDriver() {
        return ThucydidesWebDriverSupport.getDriver();
    }

    public static void maximizeWindow() {
        getWebDriver().manage().window().maximize();
    }

}
