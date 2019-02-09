package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverInitiation;

public class MainPage  extends DriverInitiation {

    @FindBy(xpath= "//input[@id='searchInput']")
    WebElement searchInput;
    @FindBy(xpath= "//input[@id='searchButton']")
    WebElement searchButton;

    public MainPage(){
        PageFactory.initElements(driver,this);

    }

    public String validateMainPageTitle(){
        return driver.getTitle();
    }


    public CricketWorldCupPage search(){
        searchInput.sendKeys("Cricket World Cup");
        searchButton.click();
        return new CricketWorldCupPage();

    }
}
