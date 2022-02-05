package tests;

import com.utils.DriverFactory;
import com.utils.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver(DriverType.CHROME);
        driver.manage().window().maximize();
        driver.get("https://hello.friday.de/quote/selectPrecondition");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
