package Lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount {

    WebDriver driver;
    public LoginSubmitButton signin;


    public CreateAccount (WebDriver driver){
        this.driver = driver;

        this.signin = new LoginSubmitButton(driver);
    }




    public void enterLogin(String login) {
        System.out.println("Enter to the second page");
        signin = new LoginSubmitButton(driver);
        signin.startLogin();
        WebElement loginInputField = driver.findElement(By.xpath("//div[@class=\"form-group\"]/input[@id=\"email_create\"]"));
        loginInputField.sendKeys(login);
        WebElement pressBtn = driver.findElement(By.xpath("//button[@name = \"SubmitCreate\"]"));
        pressBtn.click();

    }
}
