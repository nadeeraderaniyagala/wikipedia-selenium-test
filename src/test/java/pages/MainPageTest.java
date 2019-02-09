package pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.DriverInitiation;

import static org.testng.Assert.*;

public class MainPageTest extends DriverInitiation {

    public LandingPage landingPage;
    public MainPage mainPage;


    @BeforeMethod
    public void setUp() {
        initiateDrivers();
        landingPage = new LandingPage();
        landingPage.clickOnEnglish();

        mainPage = new MainPage();

    }

    @Test
    public void validateMainPageTitleTest() {

        Assert.assertEquals(mainPage.validateMainPageTitle(), "Wikipedia, the free encyclopedia", "Main Page title mismatch");

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}