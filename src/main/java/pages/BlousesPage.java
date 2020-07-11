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

    @FindBy(linkText = "In stock")
    WebElement inStockBtn;

    @FindBy(linkText = "Add to cart")
    WebElement addtoCart;

    @FindBy(id = "quantity_wanted")
    WebElement quantitybox;

    @FindBy(id = "group_1")
    WebElement sizebox;

    @FindBy(id = "color_11")
    WebElement blackcolor;

    @FindBy(id = "color_11")
    WebElement whitecolor;

    @FindBy(name = "Submit")
    WebElement submitBtn;

    @FindBy(xpath= "//*[@id=\"add_to_cart\"]/button")
    WebElement proceedTocheckupbtn;

    @FindBy(css = "button lnk_view btn btn-default")
    WebElement moreBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
    WebElement blouselink;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement proceed2btn;



    public void addBlouseToCart(String quantity, String size) {
        clickbutton(blouselink);
        cleartext(quantitybox);
        sendkeys(quantitybox, quantity);
        select = new Select(sizebox);
        select.selectByVisibleText(size);
        clickbutton(proceedTocheckupbtn);
        clickbutton(proceed2btn);
    }
}
