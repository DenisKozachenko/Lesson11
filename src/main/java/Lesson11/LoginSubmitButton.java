package Lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSubmitButton {

    WebDriver driver;
    public LoginSubmitButton(WebDriver driver) {
        this.driver = driver;
    }


    public void startLogin() {
        System.out.println("Enter to the third page");

        WebElement el = driver.findElement(By.xpath("//div[@class=\"header_user_info\"]/a[@class=\"login\"]"));

        el.click();


    }
}
