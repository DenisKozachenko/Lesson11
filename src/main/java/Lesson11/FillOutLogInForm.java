package Lesson11;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FillOutLogInForm {

    public static WebElement logfield;
    public static WebElement passfield;
    public static WebElement subbtn;
    WebDriver driver;

    public FillOutLogInForm(WebDriver driver) {

        this.driver = driver;


    }

    public void fillLogIn(String login) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        logfield = driver.findElement(By.xpath("//div[@class=\"input-text__field\"]/input[@name=\"regular\"]"));
//        logfield = driver.findElement(By.xpath("//form[@id=\"searchbox\"]/input[4]"));

        logfield.sendKeys(login);


    }

    public void fillPass (String pass) {

//        passfield = driver.findElement(By.xpath("//form[@class=\"form\"]/div[3]/input[@name=\"password\"]"));
        passfield = driver.findElement(By.xpath("//div[@class=\"input-text__field\"]/input[@type=\"password\"]"));
        passfield.sendKeys(pass);

    }

    public void pressSbmDtn (){

        subbtn = driver.findElement(By.xpath("//form[@class=\"form\"]/button"));
        subbtn.click();
    }
}
