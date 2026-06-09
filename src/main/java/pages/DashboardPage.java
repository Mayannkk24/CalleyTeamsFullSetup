package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Example locator after login
    By dashboardTitle = By.xpath("//h1");

    public boolean isDashboardDisplayed() {

        return driver.findElement(dashboardTitle).isDisplayed();
    }
}