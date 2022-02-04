package tests;

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
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SalesFunnelTests extends BaseTest {

    @Test
    public void tc1VWCaddy() throws InterruptedException {

        driver.get("https://hello.friday.de/quote/selectPrecondition");
 //       driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);
//        WebElement elementBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='uc-center-container']/div[2]/div/div/div/button[3]")));
//        elementBtn.click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("//span[contains(text(),\"Weiter\")]")).click();
        //Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//span[contains(text(),\"Weiter\")]"))));
        driver.findElement(By.xpath("//span[contains(text(),\"Weiter\")]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@name='list']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[text()='VW']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[text()='Caddy']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[text()='Kasten']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[text()='CADDY 1.4']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("monthYearFirstRegistered")).sendKeys("042007");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),\"Weiter\")]")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Wann wurdest du geboren?']")).getText(),"Wann wurdest du geboren?"); ;





    }


}
