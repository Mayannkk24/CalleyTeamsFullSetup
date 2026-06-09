import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.AgentPage;
import pages.CSVUploadPage;

public class FullSetupTest extends BaseClass {

    @Test
    public void completeFlow() throws InterruptedException {

        setup();

        driver.get("https://app.getcalley.com/Login.aspx");

        LoginPage login = new LoginPage(driver);

        login.login(
                "mayankgoley2424@gmail.com",
                "Mayank24@"
        );

        // Wait for dashboard to load
        Thread.sleep(5000);

        AgentPage agent = new AgentPage(driver);

        agent.addAgent(
                "Agent1",
                "agent1@gmail.com"
        );

        Thread.sleep(3000);

        CSVUploadPage csv = new CSVUploadPage(driver);

        csv.uploadCSV(
                "C:\\Users\\Hp\\Desktop\\sample.csv"
        );

        Thread.sleep(5000);

        tearDown();
    }
}