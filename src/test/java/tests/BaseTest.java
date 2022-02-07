package tests;

import com.utils.DriverFactory;
import com.utils.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.getDriver(DriverType.CHROME);
        driver.manage().window().maximize();
        driver.get("https://hello.friday.de/quote/selectPrecondition");

        //TODO
        // Accept Cookies
        //        WebDriverWait wait = new WebDriverWait(driver, 5);
        //        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Alle akzeptieren')]")));

        //        driver.switchTo().frame(0);
        //        driver.findElement(By.xpath("//*[@id=\"uc-center-container\"]/div[2]/div/div/div/button[3]")).click();
        //        driver.switchTo().defaultContent();

        //        ChromeOptions options = new ChromeOptions();
        //        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);

        //        Actions actions = new Actions(driver);
        //        WebElement body = driver.findElement(By.tagName("body"));
        //        actions.moveToElement(body,327,408).click().build().perform();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
