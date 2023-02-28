package webTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.Screenshots;

import java.io.IOException;

import static webTests.SeleniumHttpdriver.driver;
import static webTests.Allemodule.*;

public class musterlieferantSS {
    //Screenshots screenshots;
    @BeforeTest
    public static void test_startBrowser() {
        SeleniumHttpdriver.startBrowser();
    }
    @Test(priority = 1)
    public static void test_openBMS() throws IOException {
        SeleniumHttpdriver.openBMS();
        //String nameUsecase = "OPEN_BMS";
        //String getHours;
        //Screenshots.print(driver, nameUsecase, "openBrowser_musterlieferant_", getHours = DateHours.datehoursBMS());
    }
    @Test(priority = 2)
    public static void test_anmeldungBMS() throws IOException {
        Anmeldung.anmeldungBMS();
        String nameUsecase = "0-LOGIN";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "LoginBMS_musterlieferant_", getHours = DateHours.datehoursBMS());
    }
    @Test(priority = 3)
    public static void test_arbeitsplatz() throws IOException {
        Allemodule.arbeitsplatz();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "1-ARBEITSPLATZ";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Arbeitsplatz_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 4)
    public static void test_storniert() throws IOException {
        Allemodule.storniert();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "2-STORNIERT";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Storniert_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 5)
    public static void test_dispo_Uebersicht_Leergut() throws IOException {
        Allemodule.dispo_Uebersicht_Leergut();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "3-DISPOSITION";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Dispo_Uebersicht_leergut_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 6)
    public static void test_dispo_Sonderbestellung() throws IOException {
        Allemodule.dispo_Sonderbestellung();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "3-DISPOSITION";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Dispo_Sonderbestellung_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 7)
    public static void test_bestandsuebersicht() throws IOException {
        Allemodule.bestandsuebersicht();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "4-BESTANDSUEBERSICHTEN";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Bestandsuebersicht_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 8)
    public static void test_bestandsuebersicht_standortAuszug() throws IOException {
        Allemodule.bestandsuebersicht_standortAuszug();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "4-BESTANDSUEBERSICHTEN";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Bestandsuebersicht_Standortauszug_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 9)
    public static void test_rekla_erfassen() throws IOException {
        Allemodule.rekla_erfassen();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "5-REKLAMATION";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Rekla_Erfassen_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 10)
    public static void test_rekla_uebersicht() throws IOException {
        Allemodule.rekla_uebersicht();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "5-REKLAMATION";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Rekla_Uebersicht_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 11)
    public static void test_rekla_vorschlaege() throws IOException {
        Allemodule.rekla_vorschlaege();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "5-REKLAMATION";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Rekla_Vorschlaege_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 12)
    public static void test_rekla_stonierteMATS() throws IOException {
        Allemodule.rekla_stonierteMATS();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "5-REKLAMATION";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Rekla_Stonierte_MATS_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 13)
    public static void test_NEG() throws IOException {
        Allemodule.NEG();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "6-NUTZUNGSENTGELT";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Abrechnungsuebersicht_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 14)
    public static void test_neue_inventur() throws IOException {
        Allemodule.neue_inventur();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "7-INVENTUR";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Neue_Inventur_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 15)
    public static void test_inventur_erfassung() throws IOException {
        Allemodule.inventur_erfassung();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "7-INVENTUR";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Inventur_Erfassung_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 16)
    public static void test_inventur_historie() throws IOException {
        Allemodule.inventur_historie();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "7-INVENTUR";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Inventur_Historie_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 17)
    public static void test_sonstiges() throws IOException {
        Allemodule.sonstiges();
        PinnadelOnOff.pinnadel_ein();
        String nameUsecase = "8-SONSTIGES";
        String getHours;
        Screenshots.print(driver, "2023", "5461", nameUsecase, "Neuer_Browser-Reiter_musterlieferant_", getHours = DateHours.datehoursBMS());
        PinnadelOnOff.pinnadel_aus();
    }
    @Test(priority = 18)
    public static void test_abmeldungBMS() {
        Abmeldung.abmeldungBMS();
        driver.close();
    }
}
