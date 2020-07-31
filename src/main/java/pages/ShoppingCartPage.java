package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
    WebElement proceedbtn;

    @FindBy(css = "a.bankwire")
    WebElement bankWirebtn;

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    WebElement confirmOrderbtn;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    WebElement proceedbtn2;

    @FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
    WebElement proceedbtn3;

    @FindBy(xpath = "//span[@class='price' and @id='amount']")
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