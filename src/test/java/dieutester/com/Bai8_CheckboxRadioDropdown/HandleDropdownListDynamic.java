package dieutester.com.Bai8_CheckboxRadioDropdown;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class HandleDropdownListDynamic extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
       sleep(2);

       //Click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        sleep(1);

        //Search giá trị cần chọn
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");
        sleep(1);

        //Click chọn text đã search(cần chọn)
        sleep(1);
//        driver.findElement(By.xpath("//li[@class= 'active-result highlighted']")).click();
        Actions action= new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        closeDriver();

    }

}
