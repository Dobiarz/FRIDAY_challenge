package com.utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver(DriverType browser) {
        if (driver == null) {

            switch (browser) {

                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "/home/tomasz/Desktop/FRIDAY_challenge/src/main/resources/executables.drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;

                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "/home/tomasz/Desktop/FRIDAY_challenge/src/main/resources/executables.drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;

                default:
                    throw new InvalidArgumentException("Invalid browser name");
            }
        }
        return driver;
    }

    public static void resetDriver() {
        driver = null;
    }
}
