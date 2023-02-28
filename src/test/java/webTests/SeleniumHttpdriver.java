package webTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class SeleniumHttpdriver {
    public static WebDriver driver;
    public static void startBrowser(){
        driver = new ChromeDriver();
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\railton.oliveira\\IdeaProjects\\BMS-Regression\\src\\drivers\\chrome\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }
    public static void openBMS(){
        driver.get("https://discovery.vwgroupsupply.com/test/pmweb/Login.aspx");
    }
}
