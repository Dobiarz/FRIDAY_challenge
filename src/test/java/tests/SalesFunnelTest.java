package tests;

import com.pages.HelloFridayPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesFunnelTest extends BaseTest {

    @Test(dataProvider = "carsList")
    public void singleCarTest(String brand, String model, String shape, String fuel, String hp, String car, String month, String year) throws InterruptedException {

        Thread.sleep(5000);

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
                {"VW", "Caddy", "Kombi", "Benzin","44 kW / 60 PS", "CADDY", "04", "2007"},
                {"VW", "Golf", "Cabrio", "Benzin","53 kW / 72 PS", "GOLF-CABRIOLET", "04", "2007"},
        };
    }


}
