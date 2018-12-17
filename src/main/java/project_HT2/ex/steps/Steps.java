package project_HT2.ex.steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_HT2.ex.pages.LoginPage;
import project_HT2.ex.pages.MainPage;

public class Steps {
    WebDriver driverChrome;
    private final String MAIN_PAGE = "http://localhost:8080/";
    private final String USERNAME = "admin";
    private final String PASSWORD = "password";

    public Steps(WebDriver driver) {
        this.driverChrome = driver;
    }

    public void loginJenkinsPage() {
        LoginPage loginPage = new LoginPage(driverChrome);
        loginPage.openPage();
        loginPage.login(USERNAME, PASSWORD);
    }

    public void createNewUserJenkins() {
        MainPage mainPageChrome = new MainPage(driverChrome);
        mainPageChrome.clickOnCreateNewUserJenkinsButton();
        mainPageChrome.createNewUserJenkins("someuser", "somepassword",
                "somepassword",
                "Some Full Name", "some@addr.dom");
        mainPageChrome.deleteUser();
        mainPageChrome.confirmationCreateUserJenkins();

    }

    public void verificationLoginJenkinsPageObject() {

        driverChrome.navigate().to("http://localhost:8080/");
        driverChrome.findElement(By.id("j_username")).sendKeys("admin");
        driverChrome.findElement(By.name("j_password")).sendKeys("password");
        driverChrome.findElement(By.name("Submit")).click();
        driverChrome.quit();
        driverChrome = null;
    }

    public boolean isButtonClickVisible() {
        return driverChrome.findElement(By.id("description-link")).isEnabled();
    }

    public boolean getMainPage() {
        if (MAIN_PAGE.equals("http://localhost:8080/")) {
            return true;
        }
        return false;
    }
    public void defineManageJenkins(){
        MainPage mainPage = new MainPage(driverChrome);
        mainPage.defineManageUsers();
    }
}

