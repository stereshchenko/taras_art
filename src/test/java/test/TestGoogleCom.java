package test;

import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;
import test_setup.UITestSetup;

/**
 * Created by slava on 8/14/16.
 */
public class TestGoogleCom extends UITestSetup {
    String text = "Taras study";
    int sleepTime = 3;


    @Test
    public void test_google_com() throws InterruptedException {

        MainPage mainPage = new MainPage(driver);
        mainPage.navigateTo();
        Assert.assertTrue("search Button is not present", mainPage.searchButton.isDisplayed());
        mainPage.fillSearchInput(text);
        mainPage.searchButtonLoopClick();
        Thread.sleep(1000*sleepTime);
        //errorCollector.checkThat();
    }
}
