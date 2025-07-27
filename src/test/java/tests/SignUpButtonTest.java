package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageV0;
import utils.DriverFactory;

public class SignUpButtonTest extends BaseTest {
    @Test
    public void validateSignUpButton() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://v0-button-to-open-v0-home-page-h5dizpkwp.vercel.app/");
        HomePageV0 page = new HomePageV0(driver);
        page.clickMainButton();
        Assert.assertTrue(page.isSignUpVisible(), "Sign Up button not visible.");
    }
}