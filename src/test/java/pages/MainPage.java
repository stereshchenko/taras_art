package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by slava on 8/14/16.
 */
public class MainPage extends AbstractPage {
    @FindBy(xpath = "//input[contains(@value,'Google')]")
    public WebElement searchButton;// кнопка з Пошуку перед введенням тексту

    @FindBy(xpath = "//button[contains(@class,'lsb')]")
    public WebElement searchButtonLoop;// кнопка пошуку після ведення тексту в таблицю (ДжС змінив сторінку)

    @FindBy(id = "lst-ib")
    public WebElement srchInput;

    protected String searchInput = "//input[@id='gs_htif0']";

    private String url = "https://www.google.com.ua";//адрес

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPage() {
       // WebDriverWait exp_wait = new WebDriverWait(driver, 10);
      //   WebElement searchInp = (new WebDriverWait(driver, ELEMENT_APPEAR_TIMEOUT)).until(ExpectedConditions.presenceOfElementLocated(By.id(searchInput)); // Явне очикування

       driver.manage().timeouts().implicitlyWait(ELEMENT_APPEAR_TIMEOUT, TimeUnit.SECONDS); // не явне
        WebElement searchInp = driver.findElement(By.xpath(searchInput));
    }

    public PageInterface navigateTo(){
        driver.get(url);
        waitForPage();
        init(driver);
        return this;
    }

    public void fillSearchInput(String inputText) {
   //     srchInput.click();
        srchInput.clear();
        srchInput.sendKeys(inputText);
    }


    public void searchButtonLoopClick(){
        searchButtonLoop.click();
    }

    public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //public WebElement
}
