package dieutester.com.Bai8_CheckboxRadioDropdown;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.By;

public class Sp extends BaseTest {
    public static void main(String[] args)  {
        createDriver();
        driver.get("https://app.hrsale.com/");
        sleep(3);
        driver.findElement(By.xpath("//button[normalize-space()='Super Admin']")).click();
        sleep(3);
        driver.findElement(By.xpath("//span[@class='ladda-label']")).click();
        sleep(3);
        driver.findElement(By.xpath("//ul[@class='pc-navbar']//li//span[normalize-space()='Projects']")).click();
       sleep(2);
        driver.findElement(By.xpath("//a[normalize-space()='Add Project']")).click();
//        closeDriver();

    }
}
