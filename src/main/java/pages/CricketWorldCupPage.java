package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverInitiation;

public class CricketWorldCupPage extends DriverInitiation {

    @FindBy(xpath= "//span[@id='Tournament_history']")
    WebElement tournamentHistory;

    public CricketWorldCupPage(){
        PageFactory.initElements(driver,this);

    }

    public String validateCricketPageTitle(){
        return driver.getTitle();
    }


    public void scrollToTournamentHistory(){
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",tournamentHistory);
    }

    public void getTournamentHistoryDetails(){

    }

}
