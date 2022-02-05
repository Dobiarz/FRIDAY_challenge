package com.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListner implements ITestListener {

    public void onTestFailure(ITestResult result) {
        try {
            Screenshot.takeScreenshot(DriverFactory.getDriver(DriverType.CHROME));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
