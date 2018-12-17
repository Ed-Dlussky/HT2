package project_HT2.ex.pages;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driverChrome;

    public abstract void openPage();

    public AbstractPage(WebDriver driverChrome){
        this.driverChrome = driverChrome;
        }
    }

