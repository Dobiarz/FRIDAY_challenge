import com.utils.DriverFactory;
import com.utils.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class salesFunnelTests {

    @Test
    public void sampleTest() throws InterruptedException {

        WebDriver driver = DriverFactory.getDriver(DriverType.CHROME);

        driver.get("https://hello.friday.de/quote/selectPrecondition");
//        driver.switchTo().frame(0);
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, 5);
//        WebElement elementBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='uc-center-container']/div[2]/div/div/div/button[3]")));
//        elementBtn.click();

        driver.findElement(By.xpath("//button"));
        driver.findElement(By.xpath("//span[contains(text(),\"Weiter\")]")).click();
        driver.quit();

    }



}
