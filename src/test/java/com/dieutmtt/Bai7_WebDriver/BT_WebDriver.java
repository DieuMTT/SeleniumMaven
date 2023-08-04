package com.dieutmtt.Bai7_WebDriver;

import com.dieutmtt.Bai5_Locators.BT_LocatorsCRM;
import com.dieutmtt.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BT_WebDriver extends BaseTest {
    public static void main(String[] args) {
        createBrowser();
        driver.get("https://crm.anhtester.com/admin/projects/project");
        //Step1: Login
        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).sendKeys(Keys.ENTER);

        //Step 2: Input data
        driver.findElement(By.xpath(BT_LocatorsCRM.inputProjectName)).sendKeys(" Project Name 1");
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownCustomer)).click();
        sleep(2);
        driver.findElement(By.xpath(BT_LocatorsCRM.inputSearchCustomer)).sendKeys("Company1");
        driver.findElement(By.xpath("//a[@id='bs-select-6-0']")).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownBillingType)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.optionBillingType)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownStatus)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.optionStatus)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputRatePerHour)).sendKeys("10");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputEstimatedHours)).sendKeys("10");
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownMembers)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputSearchMembers)).sendKeys("Admin Example");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

//        driver.findElement(By.xpath(BT_LocatorsCRM.inputStartDate)).sendKeys("25-07-2023");
//        driver.findElement(By.xpath(BT_LocatorsCRM.inputDeadline)).sendKeys("26-07-2023");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputTagsMe)).sendKeys("Java");






//        closeBrowser();

    }
}
