package dieutester.com.Bai8_CheckboxRadioDropdown;

import dieutester.com.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListStatic extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //Khởi tạo đối tượng select và giá trị  là một WebElement của thẻ select trong HTML
        Select select = new Select(selectElement);

        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra kiểu của Select:" + select.isMultiple());
        System.out.println("Số lượng option:" + select.getOptions().size());

        //Get option với các hàm hỗ trợ của class Select
        select.selectByVisibleText("Friday");
        sleep(2);

        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("Thursday");
        sleep(2);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());

        sleep(2);
        closeDriver();

    }

}
