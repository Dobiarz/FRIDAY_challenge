package com.utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver (DriverType browser) {
        switch (browser) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/home/tomasz/Desktop/FRIDAY_challenge/src/main/resources/executables.drivers/chromedriver");
                return new ChromeDriver();

            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "/home/tomasz/Desktop/FRIDAY_challenge/src/main/resources/executables.drivers/geckodriver");
                return new FirefoxDriver();
            default:
                throw new InvalidArgumentException("Invalid browser name");
        }
    }

    public static void resetDriver() {
        driver = null;
    }

}
