package test_setup;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by slava on 8/14/16.
 */
public class UITestSetup {

    protected ErrorCollector errorCollector = new ErrorCollector();

    protected static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){
        driver=BrowserManager.driver;
    }


    @AfterClass
    public static void closeBrovser(){
        driver.close();
    }
}
