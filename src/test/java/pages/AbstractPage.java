package pages;


import org.openqa.selenium.WebDriver;

/**
 * Created by slava on 8/14/16.
 */
public abstract class AbstractPage implements PageInterface {
    final int ELEMENT_APPEAR_TIMEOUT=3;
    WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

}
