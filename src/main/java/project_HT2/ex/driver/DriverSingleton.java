package project_HT2.ex.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
    private static WebDriver driverChrome;

    private static final String WEBDRIVER_GOOGLE_DRIVER = "webdriver.chrome.driver";
    private static final String GOOGLEDRIVER_GOOGLEDRIVER_EXE_PATH = ".\\chromedriver_win32\\chromedriver.exe";

    private DriverSingleton() {
    }

    public static WebDriver getDriverChrome() {
        if (driverChrome == null) {
            System.setProperty(WEBDRIVER_GOOGLE_DRIVER, GOOGLEDRIVER_GOOGLEDRIVER_EXE_PATH);
            driverChrome = new ChromeDriver();
            driverChrome.manage().window().maximize();
        }
        return driverChrome;
    }
    public void closeChrome(){
        driverChrome.quit();
        driverChrome = null;
    }
}

