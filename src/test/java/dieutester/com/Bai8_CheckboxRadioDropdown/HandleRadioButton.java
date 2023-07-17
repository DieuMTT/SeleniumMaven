package dieutester.com.Bai8_CheckboxRadioDropdown;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement radioButton = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/input"));
      if(radioButton.isSelected()==false){
          radioButton.click();
          System.out.println(radioButton.isSelected());
      }





    }
}
