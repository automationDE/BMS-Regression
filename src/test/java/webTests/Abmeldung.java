package webTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Abmeldung extends SeleniumHttpdriver {
    public static void abmeldungBMS() {
        //Abmeldung mit click auf "Abmelden"
        driver.findElement(By.id("LinkButtonLogoff")).click();
        try{
            Thread.sleep(60);
        }
        catch(InterruptedException ie){
        }
    }
}