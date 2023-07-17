package dieutester.com.Bai7_WebDriver;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
        driver.get("https://app.hrsale.com/");
        driver.findElement(By.xpath("//button[contains(.,'Super Admin')]")).click();
        driver.findElement(By.xpath("//span[contains(.,'Login')]")).click();

        Thread.sleep(6000);
        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@class ='pc-navbar']/li"));
        Thread.sleep(6000);
        System.out.println(listMenu.get(3).getText());
        listMenu.get(3).click();

//        for(int i=0 ; i < listMenu.size(); i++){
//            System.out.println(listMenu.get(i).getText());
//        }

        //closeDriver();nt
    }
}
