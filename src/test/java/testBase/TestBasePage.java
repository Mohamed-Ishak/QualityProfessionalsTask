package testBase;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;

public class TestBasePage extends AbstractTestNGCucumberTests {

    public static WebDriver driver ;
    @BeforeTest
    public void setupWebDriver(){
      System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.manage().deleteAllCookies();
      driver.navigate().to("https://www.demoblaze.com/");
    }


    @AfterTest()
    public void tearDown(){
        driver.quit();
    }
}
