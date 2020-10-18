package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import java.io.IOException;

public class LoginTestParallel extends BaseTest2{
    HomePage homeObj;
    LoginPage loginObj;
    MyAccountPage myaccountObj;

    @Test
    public void userLogin() throws IOException, ParseException {

        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        homeObj = new HomePage(getDriver());
        homeObj.openLoginPage();
        loginObj = new LoginPage(getDriver());
        loginObj.openLoginPage(jsonReader.email, jsonReader.password);
        myaccountObj = new MyAccountPage(getDriver());

    }
}

