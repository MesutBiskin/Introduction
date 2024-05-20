package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static WebDriver driver;



    public static WebDriver getDriver(){
        if(driver==null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":

                    driver   = new ChromeDriver();

                    break;

                case "firefox":

                    driver = new FirefoxDriver();
                    break;

                case "ie":

                    driver = new InternetExplorerDriver();
                    break;



            }
        }
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
