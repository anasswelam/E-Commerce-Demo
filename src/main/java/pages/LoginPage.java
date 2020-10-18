package pages;

import cucumber.api.java.cs.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "email_create")
  public WebElement emailRbox;
    @FindBy(id = "SubmitCreate")
    WebElement createbtn;
    @FindBy(id = "email")
    WebElement emailLbox;
    @FindBy(id = "passwd")
    WebElement passwdLbox;
    @FindBy(id = "SubmitLogin")
    WebElement signinbtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openRegistraionPage(String email) {
        sendkeys(emailRbox, email);
        clickbutton(createbtn);


    }

    public void openLoginPage(String email, String password) {
        sendkeys(emailLbox, email);
        sendkeys(passwdLbox, password);
        clickbutton(signinbtn);

    }


}
