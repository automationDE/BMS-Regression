package webTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PinnadelOnOff extends SeleniumHttpdriver {
    //public static String element;
    public static void pinnadel_ein() {
        //WebElement pinnadel_aus = driver.findElement(By.id("MenuShowHideButton"));
        driver.findElement(By.id("MenuShowHideButton")).click();
    }
    public static void pinnadel_aus() {
        //WebElement pinnadel_ein = driver.findElement(By.id("MenuShowHideButton"));
        driver.findElement(By.id("MenuShowHideButton")).click();
    }
}
