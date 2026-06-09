package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSVUploadPage {

    WebDriver driver;

    public CSVUploadPage(WebDriver driver){
        this.driver=driver;
    }

    public void uploadCSV(String path){

        driver.findElement(By.id("fileUpload"))
                .sendKeys(path);

        driver.findElement(By.id("btnImport"))
                .click();
    }
}