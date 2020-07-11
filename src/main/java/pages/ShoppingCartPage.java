package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "uniform-cgv")
    public WebElement agreeCheckBox;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/div/h3")
    public WebElement successBankWireMsg;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
    public WebElement confirmationMsg;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    WebElement proceedbtn;

    @FindBy(css = "a.bankwire")
    WebElement bankWirebtn;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    WebElement confirmOrderbtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    WebElement proceedbtn2;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    WebElement proceedbtn3;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/div/p[2]")
  public   WebElement totalprice;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/div/p[3]/b")
    public WebElement dollarcurrancy;



    public void openSignIn() {
        clickbutton(proceedbtn);
    }

    public void confirmAddress() {
        clickbutton(proceedbtn2);
    }


    public void openPayment() {
        clickbutton(agreeCheckBox);
        System.out.println(agreeCheckBox.isSelected());
        clickbutton(proceedbtn3);

    }

    public void UserOpenBankWire() {
        clickbutton(bankWirebtn);
    }

    public void userConfirmOrder(){
        clickbutton(confirmOrderbtn);
    }

}