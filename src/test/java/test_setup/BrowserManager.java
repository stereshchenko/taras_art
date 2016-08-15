package test_setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by slava on 8/14/16.
 */
public class BrowserManager {
    public static final WebDriver driver = getDriver();

    private static WebDriver getDriver(){
        WebDriver firefoxDriver = new FirefoxDriver();
        return firefoxDriver;
    }
}
