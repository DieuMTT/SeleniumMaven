package dieutester.com;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class TestSelenium {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
 //        fix lỗi WARNING: Invalid Status code=403 text=Forbidden trên ChromeDriver 111 khi sử dụng Selenium.
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Login
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//div[@class='form-group'][contains(.,'Login')]")).click();
        //Click on menu Customers
        driver.findElement(By.xpath("//span[@class='menu-text'][contains(.,'Customers')]")).click();
        Thread.sleep(2000);
        //Click on [New Customer]button
        driver.findElement(By.xpath("//a[@class='btn btn-primary mright5 test pull-left display-block']")).click();
        //Input data
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("CompanyA");
        Thread.sleep(3000);
        //Click vào [Groups]dropdown
        driver.findElement(By.xpath("(//div[@class='filter-option-inner-inner'][contains(.,'Nothing selected')])[1]")).click();
        //Search giá trị cần chọn
        driver.findElement(By.xpath("//input[contains(@aria-controls,'bs-select-1')]")).sendKeys("ABC");
        Thread.sleep(2000);
        //Click chọn Text đã search (cần chọn)
        //Cách ENTER dùng cho TH chỉ hiển thị 1 giá trị lựa chọn
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        //Create 1 group
        driver.findElement(By.xpath("//a[contains(@class,'btn btn-default')]")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("DMTT");
        driver.findElement(By.xpath("//button[@group='submit'][contains(.,'Save')]")).click();
        //Save
        driver.findElement(By.xpath("//button[@class='btn btn-default save-and-add-contact customer-form-submiter'][contains(.,'Save and create contact')]")).click();

//        Thread.sleep(8000);
//        // Tắt browser
//        driver.quit();
    }

}
