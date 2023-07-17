package dieutester.com.Bai7_WebDriver;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.WindowType;

public class AdvanceBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://translate.google.com/?hl=vi&sl=auto&tl=vi&op=translate");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://text-compare.com/");

        closeDriver();

    }
}
