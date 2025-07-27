package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.W3SchoolsPage;
import utils.DriverFactory;

public class SearchInputTest extends BaseTest {
    @Test
    public void validateSearchInput() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_target");
        W3SchoolsPage page = new W3SchoolsPage(driver);
        page.clickVisitLink();
        Assert.assertTrue(page.isSearchInputVisible(), "Search input not visible.");
    }
}
