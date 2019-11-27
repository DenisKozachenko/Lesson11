package Lesson11;

import com.codeborne.selenide.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSetUp {

    public WebDriver driver;
    private final Properties config = Config.loadProperties("src/main/resources/test.properties");

    @BeforeMethod
    public void setup(){
        driver = Lesson11.WebDriverFactory.getDriver(Lesson11.DriversType.CHROME);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseurl"));
    }


    @AfterMethod
    public void cleanup() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
