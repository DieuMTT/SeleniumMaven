package com.anhtester.Bai6_WebElement;

import com.anhtester.Bai5_Locators.BT_LocatorsCRM;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class BT_WebElement extends BaseTest {
    public static void main(String[] args) {

        //Khởi tạo browser
        createBrowser();
        driver.get("https://crm.anhtester.com/admin/clients");
        String headerPage = driver.findElement(By.xpath(BT_LocatorsCRM.headerLoginPage)).getText();
        System.out.println("Header Login Page: " + headerPage);
        WebElement checkboxRemember = driver.findElement(By.xpath("//input[@id='remember']"));
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        sleep(2);
        System.out.println("isSelected():"+ checkboxRemember.isSelected() );

        //Step1: Login
        //Email
        WebElement email = driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail));
        email.clear();
        email.sendKeys("admin@example.com");

        //Passwords
        WebElement passwords = driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword));
        passwords.clear();
        passwords.sendKeys("123456");

        //Button Login
        WebElement buttonLogin = driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin));
        System.out.println("Displayed:"+ buttonLogin.isDisplayed());
        System.out.println("Enabled:" + buttonLogin.isEnabled());
        System.out.println("Label of  Login button :" +buttonLogin.getText());
        System.out.println("Background Color: " + buttonLogin.getCssValue("background-color"));
        System.out.println("Text Color: " + buttonLogin.getCssValue("color"));
        System.out.println("Type value: " + buttonLogin.getAttribute("type"));

        Dimension dimensions = buttonLogin.getSize();
        System.out.println("Height:" + dimensions.getHeight());
        System.out.println("Width:"+ dimensions.getWidth());

        Point point = buttonLogin.getLocation();
        System.out.println("X:" + point.getX());
        System.out.println("Y:" + point.getY());

        buttonLogin.click();

        //Step 2: Click on Customer menu
        driver.findElement(By.xpath(BT_LocatorsCRM.menuCustomers)).click();
        sleep(2);

        //Step 3: Click on [New Customer] button
        driver.findElement(By.xpath(BT_LocatorsCRM.buttonAddNewCustomer)).click();
        sleep(2);

        //Step 4: Input data
        driver.findElement(By.xpath(BT_LocatorsCRM.inputCompanyName)).sendKeys("Company1");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputVatNumber)).sendKeys("9");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPhone)).sendKeys("0365280779");
        driver.findElement((By.xpath(BT_LocatorsCRM.inputWebsite))).sendKeys("https://crm.anhtester.com/admin/clients/client");
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownGroups)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputSearchGroup)).sendKeys("VIP");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownCurrency)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputSearchCurrency)).sendKeys("USD");
        action.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownLanguage)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.optionVietnamese)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputAddress)).sendKeys("Address");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputCity)).sendKeys("HCM");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputState)).sendKeys("Active");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputZipCode)).sendKeys("2310006");
        driver.findElement(By.xpath(BT_LocatorsCRM.dropdownCountry)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputSearchCountry)).sendKeys("Vietnam");
        action.sendKeys(Keys.ENTER).perform();
        sleep(5);

        //Step 5: Click on [Save ] button
        driver.findElement(By.xpath(BT_LocatorsCRM.buttonSave)).click();
        sleep(2);
        closeBrowser();
    }
}
