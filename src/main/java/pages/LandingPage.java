package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.DriverInitiation;

public class LandingPage extends DriverInitiation {

    @FindBy(xpath= "//strong[text()='English']")
    WebElement englishLink;

    public LandingPage(){
        PageFactory.initElements(driver,this);

    }


    public String validateLandingPageTitle(){
       return driver.getTitle();
    }

    public MainPage clickOnEnglish(){
        englishLink.click();
        return new MainPage();
    }
}
