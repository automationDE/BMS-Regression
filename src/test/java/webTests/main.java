package webTests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class main {
    @Test(priority = 1)
    public static void test_main() {
        SeleniumHttpdriver.startBrowser();
        SeleniumHttpdriver.openBMS();
        Anmeldung.anmeldungBMS();
        PinnadelOnOff.pinnadel_ein();
        PinnadelOnOff.pinnadel_aus();
        //String nameUsecase = "OPEN_BMS";
        //String getHours;
        //Screenshots.print(driver, nameUsecase, "openBrowser_musterlieferant_", getHours = DateHours.datehoursBMS());
    }
}