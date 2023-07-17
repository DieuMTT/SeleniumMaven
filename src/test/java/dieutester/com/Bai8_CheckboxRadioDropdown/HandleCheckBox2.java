package dieutester.com.Bai8_CheckboxRadioDropdown;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckBox2 extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get(" https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

       boolean checkboxStatus = checkboxOne.isSelected();
        System.out.println(checkboxStatus);
        if(checkboxStatus == false){
            checkboxOne.click();
        }
        sleep(1);
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println(checkboxStatusAfter);

        WebElement message = driver.findElement(By.xpath("//div[normalize-space()='Success - Check box is checked']"));
        System.out.println(message.isDisplayed());
        System.out.println(message.getText());
       closeDriver();




    }
}
