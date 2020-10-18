package tests;

import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest2 {


   public static String url = "http://automationpractice.com/index.php";
    protected ThreadLocal<RemoteWebDriver> driver=null;


    @BeforeClass
    @Parameters({"browser"})
    public void startup(@Optional("chrome") String browser) throws MalformedURLException {
        driver=new ThreadLocal<>();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName",browser);

        driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps));
        getDriver().navigate().to(url);


    }
    public WebDriver getDriver(){
       return driver.get();
    }

    @AfterClass
    public void closedriver(){
        getDriver().quit();
    }

    @AfterMethod
    public void screenshotOnFailure(ITestResult result)
    {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.capturescreenshot(getDriver(), result.getName());
        }
    }
}
