package tests;

import com.pages.HelloFridayPage;
import com.utils.TestListner;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = {TestListner.class})
public class SalesFunnelTest extends BaseTest {

    @Test(dataProvider = "carsList")
    public void singleCarTest(String brand, String model, String shape, String fuel, String hp, String car, String month, String year) throws InterruptedException {

        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Alle akzeptieren']")));

        HelloFridayPage helloFridayPage = new HelloFridayPage(driver)
                .clickFurtherButton()
                .clickFurtherButton()
                .searchBrandModel()
                .chooseBrand(brand)
                .chooseModel(model)
                .chooseShape(shape)
                .chooseFuel(fuel)
                .chooseHP(hp)
                .chooseCar(car)
                .inputFirstRegistration(month, year)
                .clickFurtherButton();

        Assert.assertEquals(helloFridayPage.getWhenWereYouBorn().getText(), "Wann wurdest du geboren?");
    }

    @DataProvider(name = "carsList")
    public Object[][] provideCarsList() {
        return new Object[][]{
                {"VW", "Caddy", "Kombi", "Benzin", "44 kW / 60 PS", "CADDY", "04", "2007"},
                {"VW", "Golf", "Cabrio", "Benzin", "53 kW / 72 PS", "GOLF-CABRIOLET", "04", "2007"},
                {"VW", "Passat", "Limousine", "Diesel", "50 kW / 68 PS", "PASSAT LIM. DIESEL", "04", "2007"},
                {"OPEL", "Astra Pkw", "Kombi", "Gas", "66 kW / 90 PS", "ASTRA-H-CARAVAN 1.4 LPG", "05", "2008"},
                {"OPEL", "Vectra", "Kombi", "Benzin", "74 kW / 101 PS", "VECTRA-B-CARAVAN 1.6 16V", "05", "2008"},
                {"OPEL", "Insignia", "Limousine", "Diesel", "81 kW / 110 PS", "INSIGNIA STH 2.0 CDTI", "05", "2008"},
                {"FORD", "Focus", "Kombi", "Diesel", "55 kW / 75 PS", "FOCUS TURNIER 1.8 D", "06", "2009"},
                {"FORD", "Mondeo", "Kombi", "Diesel", "65 kW / 88 PS", "MONDEO TURNIER TURBO DIESEL", "06", "2009"},
                {"FORD", "Escort", "Cabrio", "Benzin", "51 kW / 69 PS", "ESCORT CABRIO", "06", "2009"},
        };
    }
}
