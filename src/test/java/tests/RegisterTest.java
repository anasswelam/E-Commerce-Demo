package tests;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RegisterTest extends BaseTest{

    HomePage homeObj;
    LoginPage loginObj;
    MyAccountPage myaccountObj;
    RegistrationPage registraionObj;

    @Test(priority = 1)
    public void EnterMailToRegistration() throws IOException, ParseException {

        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        homeObj = new HomePage(driver);
        homeObj.openLoginPage();
        loginObj = new LoginPage(driver);
        loginObj.openRegistraionPage(jsonReader.email);
    }
            @Test(priority = 2)
            public void UserRegistrationTest() throws ParseException, IOException {
                        JsonDataReader jsonReader = new JsonDataReader();
                        jsonReader.JsonReader();
            registraionObj = new RegistrationPage(driver);
            registraionObj.createUserAccount
                    (jsonReader.firstname,jsonReader.lastname,jsonReader.email,
                            jsonReader.password,jsonReader.address,jsonReader.city,
                            jsonReader.state,jsonReader.zipcode,jsonReader.country,jsonReader.mobile,jsonReader.alias);

            Assert.assertTrue(registraionObj.SuccessRegistrationMgs.getText().contains("Welcome to your account."));
            myaccountObj = new MyAccountPage(driver);
            myaccountObj.userLogout();

        }
    }

















