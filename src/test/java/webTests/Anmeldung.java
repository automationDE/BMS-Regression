package webTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Anmeldung extends SeleniumHttpdriver {
    public static void anmeldungBMS() {
        WebElement txtbx_username1 = driver.findElement(By.name("ctl00$c$MaskLogin$TextBoxFieldElementUserName"));
        txtbx_username1.sendKeys("XXXXXXXXXXXXXX");

        //Find das Passwort und gib das Passwort ein
        WebElement txtbx_username2 = driver.findElement(By.id("c_MaskLogin_TextBoxFieldElementPassword"));
        txtbx_username2.sendKeys("XXXXXXXXXXXXXXX");

        //Login mit click auf "Anmelden"
        driver.findElement(By.id("c_MaskLogin_ButtonButtonElementLogin")).click();
        try{
            Thread.sleep(60);
         }
         catch(InterruptedException ie){
         }
        //Meldung neue Version des BMSs Systems
        //driver.findElement(By.id("c_ControlID1_ButtonOK")).click();
    }
}