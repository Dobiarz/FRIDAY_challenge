package tests;

import com.pages.HelloFridayPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalesFunnelTests extends BaseTest {

    @Test
    public void tc1VWCaddy() throws InterruptedException {
        
        Thread.sleep(5000);

        HelloFridayPage helloFridayPage = new HelloFridayPage(driver)
                .clickFurtherButton()
                .clickFurtherButton()
                .searchBrandModel()
                .chooseBrand("VW")
                .chooseModel("Caddy")
                .chooseShape("Kasten")
                .chooseCar("CADDY 1.4")
                .inputFirstRegistration("04", "2007")
                .clickFurtherButton();

        Assert.assertEquals(helloFridayPage.getWhenWereYouBorn().getText(), "Wann wurdest du geboren?");

    }
}
