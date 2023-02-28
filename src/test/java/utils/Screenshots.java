package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import webTests.SeleniumHttpdriver;

import java.io.File;
import java.io.IOException;

public class Screenshots {
    String anno = "";
    String version = "";
    public static void print(WebDriver driver, String anno, String version, String nameUsecase, String nameSS, String dateHours) throws IOException {
        File pic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pic, new File("Y:\\BEHAELTERNETZWERK\\BMS-TESTING\\BMS-SS\\" + anno + "\\" + version + "\\" + nameUsecase + "\\" + nameSS + dateHours + ".png"));
    }
}
