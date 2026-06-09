package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentPage {

    WebDriver driver;

    public AgentPage(WebDriver driver){
        this.driver=driver;
    }

    public void addAgent(String name,String email){

        driver.findElement(By.id("txtAgentName"))
                .sendKeys(name);

        driver.findElement(By.id("txtAgentEmail"))
                .sendKeys(email);

        driver.findElement(By.id("btnSave"))
                .click();
    }
}