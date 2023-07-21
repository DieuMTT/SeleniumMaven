package com.anhtester.Bai7_WebDriver;

import com.anhtester.Bai5_Locators.BT_LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

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
        driver.findElement(By.xpath(BT_LocatorsCRM.inputSearchCustomer)).sendKeys("AC");
        sleep(1);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownBillingType)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.optionBillingType)).click();


//        closeBrowser();

    }
}