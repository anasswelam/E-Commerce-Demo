package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(linkText = "Sign in")
    WebElement loginbtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        clickbutton(loginbtn);
    }


}



