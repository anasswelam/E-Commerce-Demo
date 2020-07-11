package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class BasePage {
  public WebDriver driver;
    JavascriptExecutor jse;
    Select select;
    public Actions action ;

    public BasePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }



    public void clickbutton(WebElement button)
    {
        button.click();

    }

    public  void sendkeys(WebElement text, String value)
    {
        text.sendKeys(value);
    }

    public  void scroll()
    {
        jse.executeScript("scrollBy(0,2500)");
    }
    public void cleartext(WebElement text)
    {
        text.clear();
    }



}

