package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloFridayPage {

    @FindBy(xpath = "//span[contains(text(),'Weiter')]")
    private WebElement furtherButton;

    @FindBy(name = "list")
    private WebElement searchBrandModel;

    @FindBy(name = "monthYearFirstRegistered")
    private WebElement inputFirstRegistration;

    @FindBy(xpath = "//div[text()='Wann wurdest du geboren?']")
    private WebElement whenWereYouBorn;

    private WebDriver driver;

    public HelloFridayPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public HelloFridayPage clickFurtherButton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(furtherButton)).click();
        return this;
    }

    public HelloFridayPage searchBrandModel() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(searchBrandModel)).click();
        return this;
    }

    public void clickLabelWithText(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='" + text + "']"))).click();
    }

    public HelloFridayPage chooseBrand(String brand) {
        clickLabelWithText(brand);
        return this;
    }

    public HelloFridayPage chooseModel(String model) {
        clickLabelWithText(model);
        return this;
    }

    public HelloFridayPage chooseShape(String shape) {
        clickLabelWithText(shape);
        return this;
    }

    public HelloFridayPage chooseCar(String car) {
        clickLabelWithText(car);
        return this;
    }

    public HelloFridayPage inputFirstRegistration(String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(inputFirstRegistration)).sendKeys(month + year);
        return this;
    }

    public WebElement getWhenWereYouBorn() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(whenWereYouBorn));
        return whenWereYouBorn;
    }
}
