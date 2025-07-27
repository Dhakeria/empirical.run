package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class W3SchoolsPage {
    private WebDriver driver;

    public W3SchoolsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickVisitLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")));
        driver.findElement(By.linkText("Visit W3Schools!")).click();
    }

    public boolean isSearchInputVisible() {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tnb-google-search-input']")));
        return searchInput.isDisplayed();
    }


}
