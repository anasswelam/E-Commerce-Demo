package tests;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoginTest extends BaseTest {
    HomePage homeObj;
    LoginPage loginObj;
    MyAccountPage myaccountObj;

    @Test
    public void userLogin() throws IOException, ParseException {

        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
            homeObj = new HomePage(driver);
            homeObj.openLoginPage();
            loginObj = new LoginPage(driver);
            loginObj.openLoginPage(jsonReader.email, jsonReader.password);
            myaccountObj = new MyAccountPage(driver);
            myaccountObj.openBlousesPage();

        }
    }



