package Lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class TestThree {
    private static WebDriver driver;
    public  FillOutLogInForm fillOutLogInForm;





    @BeforeMethod
    static void startDriver()  {

        System.out.println("Before all !");
        Path chromeDriverPath = Paths.get("D:\\Install/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", String.valueOf(chromeDriverPath.toAbsolutePath()));

        //----------------------------------------------------------------------------------------
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.navigate().to("https://accounts.ukr.net/login?client_id=9GLooZH9KjbBlWnuLkVX&drop_reason=logout");
        driver.manage().deleteAllCookies();
//        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @Test(dataProvider="getData")
    public void instanceDbProvider(String login, String password) {
        fillOutLogInForm = new FillOutLogInForm(driver);
        fillOutLogInForm.fillLogIn(login);
        fillOutLogInForm.fillPass(password);
        fillOutLogInForm.pressSbmDtn();

//        System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");


    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{"dkozachenko", "test"}};
    }
}
