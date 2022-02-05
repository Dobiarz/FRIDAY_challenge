package com.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

class Screenshot {

//    private WebDriver driver;
//
//    public Screenshot(WebDriver driver) {
//        this.driver = driver;
//    }

    static void takeScreenshot(WebDriver driver) throws IOException {
        int randomNumber = (int) (Math.random() * 1000);
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotFie = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/screenshots/" + randomNumber + ".png");
        FileUtils.copyFile(screenshotFie, destinationFile);
    }
}
