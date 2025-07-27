package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverFactory;

public class BaseTest {
    @BeforeMethod
    public void setup() {
        DriverFactory.initDriver();
    }

    @AfterMethod
    public void teardown() {
        DriverFactory.quitDriver();
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver(); // just to make driver accessible to listener
    }
}
