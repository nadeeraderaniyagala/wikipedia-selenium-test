package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverInitiation {

    public static WebDriver driver;



    protected void initiateDrivers(){
        System.setProperty("webdriver.chrome.driver", "D:\\TestRepos\\Drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);


    }
}
