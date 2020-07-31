package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class BlousesPage extends BasePage {

    public BlousesPage(WebDriver driver) {
        super(driver);
        action=new Actions(driver);
    }

    @FindBy(css = "span.heading-counter")
    public WebElement resultedProduct;

    @FindBy(css = "span.heading-counter")
    public WebElement sucssessMsg;

    @FindBy(xpath = "//button[@class='exclusive']")
    WebElement addtoCart;

    @FindBy(id = "quantity_wanted")
    WebElement quantitybox;

    @FindBy(id = "group_1")
    WebElement sizebox;

    @FindBy(xpath= "//a[@name='Black']")
    WebElement blackBlouse;

    @FindBy(xpath= "//a[@name='White']")
    WebElement whiteBlouse;

    @FindBy(xpath= "//a[@class='btn btn-default button button-medium']")
    WebElement proceedbtn1;

    @FindBy(xpath = "//a[@class='product-name' and @title='Blouse']")
    WebElement blouselink;




    public void addBlouseToCart(String quantity, String size) {
        clickbutton(blouselink);
        cleartext(quantitybox);
        sendkeys(quantitybox, quantity);
        select = new Select(sizebox);
        select.selectByVisibleText(size);
        action.moveToElement(blackBlouse).click().perform();
        clickbutton(addtoCart);
        clickbutton(proceedbtn1);
    }
}
