package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("txtName");
    By email = By.id("txtEmail");
    By password = By.id("txtPassword");

    // WhatsApp Number Field
    By phone = By.name("txt_mobile");

    public void registerUser(
            String n,
            String e,
            String p,
            String pass) {

        driver.findElement(name).sendKeys(n);
        driver.findElement(email).sendKeys(e);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(phone).sendKeys(p);
    }
}