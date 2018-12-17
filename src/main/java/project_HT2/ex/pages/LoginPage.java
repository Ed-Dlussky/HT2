package project_HT2.ex.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
    private static final String MAIN_PAGE = "http://localhost:8080/";

    @FindBy(id = "j_username")
    private WebElement inputUserName;

    @FindBy(name = "j_password")
    private WebElement inputPassword;

    @FindBy(name = "Submit")
    private WebElement buttonCreateUserInLoginPage;

    public LoginPage(WebDriver driverChrome) {
        super(driverChrome);
        PageFactory.initElements(this.driverChrome, this);
    }

    public void openPage() {
        driverChrome.navigate().to(MAIN_PAGE);
    }

    public void login(String name, String password) {
        inputUserName.sendKeys(name);
        inputPassword.sendKeys(password);
        buttonCreateUserInLoginPage.click();
    }

}
