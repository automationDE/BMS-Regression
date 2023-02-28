package webTests;

import org.openqa.selenium.By;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Allemodule extends SeleniumHttpdriver {
    public static void arbeitsplatz() {
        // Open Module ARBEITSPLATZ
        driver.findElement(By.id("CXMaskMenu_ButtonLink_SCM_eurolog_MenuItemDashboard")).click();
        driver.findElement(By.id("MenuShowHideButton")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void storniert() {
        // Open Module STORNIERT
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000294")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void dispo_Uebersicht_Leergut() {
        // Open Module DISPOSITION
        driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuRPOrderPosition")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void dispo_Sonderbestellung() {
        // Open Module DISPOSITION
        driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuTAOrder")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void bestandsuebersicht() {
        // Open Module BESTANDSUEBERSICHTEN
        //driver.findElement(By.id("")).click();
       //for element in elements:
        //    element.click();

        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000187")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void bestandsuebersicht_standortAuszug() {
        // Open Module BESTANDSUEBERSICHTEN
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000191")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void rekla_erfassen() {
        // Open Module REKLAMATION
        driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuTAClaimUnified")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void rekla_uebersicht() {
        // Open Module REKLAMATION
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000270")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void rekla_vorschlaege() {
        // Open Module REKLAMATION
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000192")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void rekla_stonierteMATS() {
        // Open Module REKLAMATION
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000214")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void NEG() {
        // Open Module NUTZUNGSENTGELT
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000228")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void neue_inventur() {
        // Open Module INVENTUR
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000244")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void inventur_erfassung() {
        // Open Module INVENTUR
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000242")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void inventur_historie() {
        // Open Module INVENTUR
        driver.findElement(By.id("CXMaskMenu_LinkButtonApp_530000240")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
    public static void sonstiges() {
        // Open Module SONSTIGES
        driver.findElement(By.id("CXMaskMenu_ButtonLink_PM_MenuNewSession")).click();
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }
    }
}