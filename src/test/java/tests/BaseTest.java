package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public abstract class BaseTest {

    protected WebDriver driver;

//    @BeforeMethod
//    public void setup() {
//        driver = DriverFactory.getDriver(DriverType.CHROME);
//        driver.manage().window().maximize();
//        driver.get("https://hello.friday.de/quote/selectPrecondition");
//
//    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
