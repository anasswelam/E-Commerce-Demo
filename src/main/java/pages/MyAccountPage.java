package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
        action = new Actions(driver);
    }

    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenbtn;

    @FindBy(xpath = "//a[@title='Blouses']")
    WebElement blousesbtn;

    @FindBy(linkText = "Sign out")
   public WebElement logout;



    public void openBlousesPage() {

        action
                .moveToElement(womenbtn)
                .moveToElement(blousesbtn)
                .click()
                .build()
                .perform();
    }

    public void userLogout() {
        clickbutton(logout);
    }


}
