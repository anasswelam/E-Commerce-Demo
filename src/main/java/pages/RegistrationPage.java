package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

    @FindBy(css = "p.info-account")
    public WebElement SuccessRegistrationMgs;

    @FindBy(id = "id_gender2")
    WebElement MrsRadiobtn;

    @FindBy(id = "id_gender1")
    WebElement MrRadiobtn;

    @FindBy(id = "customer_firstname")
    WebElement firstNamebox;

    @FindBy(id = "customer_lastname")
    WebElement lastNamebox;

    @FindBy(id = "email")
    WebElement emailbox;

    @FindBy(id = "passwd")
    WebElement passwordbox;

    @FindBy(id = "firstname")
    WebElement addFirstNamebox;

    @FindBy(id = "lastname")
    WebElement addLastNamebox;

    @FindBy(id = "address1")
    WebElement addressbox;

    @FindBy(id = "city")
    WebElement citybox;

    @FindBy(id = "id_state")
    WebElement statebox;

    @FindBy(id = "postcode")
    WebElement zipCodebox;

    @FindBy(id = "id_country")
    WebElement countrybox;

    @FindBy(id = "phone_mobile")
    WebElement mobilenumberbox;

    @FindBy(id = "alias")
    WebElement aliasbox;

    @FindBy(id = "submitAccount")
    WebElement registerbtn;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void createUserAccount(String firstname, String lastname, String email, String password, String address, String city
            , String state, String zipcode, String country, String mobile, String alias) {

        sendkeys(firstNamebox, firstname);
        sendkeys(lastNamebox, lastname);
        cleartext(emailbox);
        sendkeys(emailbox, email);
        sendkeys(passwordbox, password);
        cleartext(addFirstNamebox);
        sendkeys(addFirstNamebox, firstname);
        cleartext(addLastNamebox);
        sendkeys(addLastNamebox, lastname);
        sendkeys(addressbox, address);
        sendkeys(citybox, city);
        select = new Select(statebox);
        select.selectByVisibleText(state);
        sendkeys(zipCodebox, zipcode);
        select = new Select(countrybox);
        select.selectByVisibleText(country);
        sendkeys(mobilenumberbox, mobile);
        cleartext(aliasbox);
        sendkeys(aliasbox, alias);
        clickbutton(registerbtn);
    }


}
