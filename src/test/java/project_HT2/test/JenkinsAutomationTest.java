package project_HT2.test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import project_HT2.ex.driver.DriverSingleton;
import project_HT2.ex.pages.LoginPage;
import project_HT2.ex.pages.MainPage;
import project_HT2.ex.steps.Steps;

public class JenkinsAutomationTest {

    private WebDriver driverChrome;
    private final String MAIN_PAGE = "http://localhost:8080/";
    private final String USERNAME = "admin";
    private final String PASSWORD = "password";

    @BeforeMethod
    public void startDriverChrome() {
        driverChrome = DriverSingleton.getDriverChrome();
    }

    @Test
    public void verificationOfTaskTest() {
        Steps steps = new Steps(driverChrome);
        steps.loginJenkinsPage();
        steps.createNewUserJenkins();
        Assert.assertTrue(steps.isButtonClickVisible(), "Button click is not visible");
    }

    @Test
    public void verificationTitleUsernameTest(){
        LoginPage loginPage = new LoginPage(driverChrome);
        loginPage.openPage();
        loginPage.login(USERNAME,PASSWORD);
        Assert.assertEquals(USERNAME, "admin");

    }
}

