package Lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CompleteForm {

    public static WebElement firstName;
    public static WebElement lastName;
    public static WebElement email;
    public static WebElement passwd;
    public static WebElement firstNameAd;
    public static WebElement lastNameAd;
    public static WebElement address1;
    public static WebElement city;
    public static WebElement zip;
    public static WebElement mobile;
    public static WebElement alias;
    public static WebElement submitBtn;
    public static WebElement text;

    WebDriver driver;


    public CompleteForm(WebDriver driver) {

        this.driver = driver;
    }


    public void findElements() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        firstName = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div/div[2]/input"));
        lastName = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div/div[3]/input"));
        email = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div/div[4]/input"));
        passwd = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div/div[5]/input"));
//
//    //----------------------------------------------
//
        firstNameAd = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[2]/p[1]/input"));
        lastNameAd = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[2]/p[2]/input"));
        address1 = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[2]/p[4]/input"));
        city = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[2]/p[6]/input"));
        zip = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[2]/p[8]/input"));
        mobile = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[2]/p[12]/input"));
        alias = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[2]/p[13]/input"));
        submitBtn = driver.findElement(By.xpath("//div[@id=\"center_column\"]/div/form/div[4]/button"));


        firstName.sendKeys("Denys");
        lastName.sendKeys("Kozachenko");
        email.sendKeys("dkozachenko@ukr.net");
        passwd.sendKeys("qwerty");
        firstNameAd.sendKeys("Denys");
        lastNameAd.sendKeys("Kozach");
        address1.sendKeys("Test");
        city.sendKeys("Test2");
        zip.sendKeys("27400");
        mobile.sendKeys("0675415555");
        alias.sendKeys("Test3");
        submitBtn.click();

    }

    public void errorMessage() {

        text = driver.findElement(By.xpath("//div[@class=\"row\"]/div/div/p[contains(text(), 'There are 3 errors')]"));


    }

}
