import base.BaseClass;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseClass {

    @Test
    public void registerUser() throws InterruptedException {

        setup();

        driver.get("https://app.getcalley.com/registration.aspx");

        RegistrationPage reg =
                new RegistrationPage(driver);

        reg.registerUser(
                "Mayank",
                "mayank123@gmail.com",
                "9876543210",
                "Password@123"
        );

        System.out.println(
                "Registration details filled successfully. Please solve CAPTCHA manually.");

        Thread.sleep(20000);

        tearDown();
    }
}