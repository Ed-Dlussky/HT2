package project_HT2.ex.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {

    private final String MAIN_BASE = "http//:localhost:8080/";

    @FindBy(xpath = "//a[@href ='/manage']")
    private WebElement buttonManageJenkins;

    @FindBy(xpath = "//a[@title='Manage Users']")
    private WebElement buttonManageUsers;

    @FindBy(xpath = "//a[@href='addUser']")
    private WebElement buttonCreateUserInCommonMeny;

    @FindBy(id = "username")
    private WebElement inputCreateUserName;

    @FindBy(name = "password1")
    private WebElement inputCreateUserPassword;

    @FindBy(name = "password2")
    private WebElement inputCreateUserConfirmPassword;

    @FindBy(name = "fullname")
    private WebElement inputCreateUserFullName;

    @FindBy(name = "email")
    private WebElement inputCreateUserEmail;

    @FindBy(id = "yui-gen1-button")
    private WebElement buttonCreateUser;

    @FindBy(xpath = "//a[@href = 'user/someuser/delete']")
    private WebElement buttonDeleteUser;

    @FindBy(id = "yui-gen1-button")
    private WebElement buttonConfirmationDeleteUserJenkins;

    @FindBy(id = "description-link")
    private WebElement buttonDescription;

    public boolean isButtonDescriptionVisible(){
        return buttonDescription.isDisplayed();
    }

    public MainPage(WebDriver driverChrome) {
        super(driverChrome);
        PageFactory.initElements(this.driverChrome,this);
    }

    public void openPage() {
        driverChrome.navigate().to(MAIN_BASE);
    }

    public void clickOnCreateNewUserJenkinsButton() {
        buttonManageJenkins.click();
        buttonManageUsers.click();
        buttonCreateUserInCommonMeny.click();
    }
    public void createNewUserJenkins(String createUserName, String createUserPassword,
                                     String createUserConfirmPassword, String createUserFullName,
                                     String createUserEmail) {

        inputCreateUserName.sendKeys(createUserName);
        inputCreateUserPassword.sendKeys(createUserPassword);
        inputCreateUserConfirmPassword.sendKeys(createUserConfirmPassword);
        inputCreateUserFullName.sendKeys(createUserFullName);
        inputCreateUserEmail.sendKeys(createUserEmail);
        buttonCreateUser.click();
    }
    public void deleteUser() {
        buttonDeleteUser.click();
    }
    public void confirmationCreateUserJenkins() {
        buttonConfirmationDeleteUserJenkins.click();
    }

    public MainPage clickOnLink(){
        buttonManageUsers.click();
        return this;
    }

    public boolean defineManageUsers (){
        if(this.buttonManageUsers.isDisplayed()) {
            if(this.buttonManageUsers.getText().equals("Manage Users")) {
                return true;
            }
        }
        return false;
    }
}
