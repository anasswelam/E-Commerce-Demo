package tests;

import com.google.common.io.Files;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeSuite
    public static void StartTest() {
        String OS = System.getProperty("os.name").toLowerCase();

        if (OS.contains("mac")){
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            driver = new ChromeDriver();

        } else  {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();

        }

        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    
@AfterMethod
public void takeScreen(ITestResult result) {
    if (result.getStatus() == ITestResult.FAILURE){
    TakesScreenshot x = (TakesScreenshot) driver;
    File screen = x.getScreenshotAs(OutputType.FILE);
    try{
        Files.move(screen, new File("Screenshots/"+result.getName() +".png"));
    }catch (IOException e){
        e.printStackTrace();
    }
}
    }

    @AfterSuite
    public void closedriver() {
        driver.quit();
    }

}
