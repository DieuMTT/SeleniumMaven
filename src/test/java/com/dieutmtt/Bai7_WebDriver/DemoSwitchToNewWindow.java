package com.dieutmtt.Bai7_WebDriver;

import com.dieutmtt.common.BaseTest;
import org.openqa.selenium.WindowType;

public class DemoSwitchToNewWindow extends BaseTest {

    public static void main(String[] args) {

        createBrowser();

        driver.get("https://github.com/anhtester/SeleniumMaven042023");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        sleep(1);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        sleep(1);
        driver.switchTo().window(mainWindow); //Chuyển về của sổ mặc định ban đầu

        closeBrowser();
    }

}
