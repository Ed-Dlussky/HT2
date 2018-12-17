package project_HT2.ex.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserJenkinsPage extends AbstractPage {

    private final String MAIN_PAGE = "http://localhost:8080/";

    public void openPage() {
        driverChrome.navigate().to(MAIN_PAGE);
    }
    public CreateNewUserJenkinsPage(WebDriver driverChrome){
        super(driverChrome);
        PageFactory.initElements(this.driverChrome,this);
    }

}
