package pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.DriverInitiation;

import static org.testng.Assert.*;

public class LandingPageTest extends DriverInitiation {

    public LandingPage landingPage;

    @BeforeMethod
    public void setUp() {
        initiateDrivers();
        landingPage=new LandingPage();

    }


    @Test
    public void landingPageTitleTest(){

        Assert.assertEquals(landingPage.validateLandingPageTitle(),"Wikipedia","Landing Page title mismatch");


    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}