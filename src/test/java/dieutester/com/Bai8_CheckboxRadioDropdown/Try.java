package dieutester.com.Bai8_CheckboxRadioDropdown;

import org.openqa.selenium.By;

import static dieutester.com.common.BaseTest.createDriver;
import static dieutester.com.common.BaseTest.driver;

public class Try {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Projects']/ancestor::a")).click();
    }
}
