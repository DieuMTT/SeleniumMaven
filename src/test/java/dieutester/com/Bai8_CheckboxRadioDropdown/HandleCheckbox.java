package dieutester.com.Bai8_CheckboxRadioDropdown;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        driver.findElement(By.xpath("//button[normalize-space()='Advanced']")).click();
        driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

        //Kiểm tra checkbox mặc định
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkboxStatusBefore = checkboxOne.isSelected();

        //Nếu checkbox chưa chọn thì click
        System.out.println(checkboxStatusBefore);
        if(checkboxStatusBefore == false){
            checkboxOne.click();
        }
        System.out.println(checkboxOne.isSelected());

        //Kiểm tra lại kết quả sau khi click chọn
        sleep(1);
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println("Trạng thái sau khi chọn:"+ checkboxStatusAfter);

        //Kiểm tra thông báo liên quan với kết quả khi đã chọn
        sleep(1);
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trạng thái message:" + message.isDisplayed());
        System.out.println(message.getText());

        // Check all checkbox
        sleep(1);
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        System.out.println(listCheckbox.size());

        for(int i= 1;i <= listCheckbox.size();i++){
            sleep(1);
            driver.findElement(By.xpath("//label[normalize-space()='Option " + i + "']")).click();
        }
        for(int i= 1;i <= listCheckbox.size();i++){
            sleep(1);
            boolean isSelected = driver.findElement(By.xpath("//label[normalize-space()='Option " + i + "']/input")).isSelected();
            System.out.println(isSelected);
        }

        closeDriver();

    }
}
