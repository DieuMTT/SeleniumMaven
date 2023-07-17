package dieutester.com.Bai7_WebDriver;

import dieutester.com.common.BaseTest;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();
       driver.navigate().to("https://app.hrsale.com/erp/login");
       sleep(2);
       closeDriver();
    }
}
