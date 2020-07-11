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

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement womenbtn;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
    WebElement blousesbtn;

    @FindBy(linkText = "Sign out")
    WebElement logout;



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
