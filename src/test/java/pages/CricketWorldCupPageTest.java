package pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.DriverInitiation;

import static org.testng.Assert.*;

public class CricketWorldCupPageTest extends DriverInitiation {

    public LandingPage landingPage;
    public MainPage mainPage;
    public CricketWorldCupPage cricketWorldCupPage;


    @BeforeMethod
    public void setUp() {
        initiateDrivers();
        landingPage = new LandingPage();
        landingPage.clickOnEnglish();

        mainPage = new MainPage();
        mainPage.search();

        cricketWorldCupPage = new CricketWorldCupPage();

    }


    @Test
    public void validateCricketPageTitleTest() {
        Assert.assertEquals(cricketWorldCupPage.validateCricketPageTitle(), "Cricket World Cup - Wikipedia", "Cricket Page title mismatch");
    }

    @Test
    public void validateTournamentHistory(){
        cricketWorldCupPage.scrollToTournamentHistory();
    }

    @AfterMethod
    public void tearDown() {
       // driver.quit();
    }
}