package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import tests.BaseTest;
import tests.RegisterTest;

public class UserRegistraion extends BaseTest {
    HomePage homeObj;
    LoginPage loginObj;
    RegistrationPage register;
MyAccountPage myaccount;
    @Given("the user in the home page")
    public void userregister(){
        homeObj =new HomePage(driver);
        homeObj.openLoginPage();

}
    @When("user fill <email>")
    public void usercanregister(String email){
        loginObj=new LoginPage(driver);
        loginObj.openRegistraionPage(email);
    }

    @And("user fill <firstname>,<lastname>,<email>,<password>,<address>,<city>,<state>,<zipcode>,<country>,<mobile>,<alias>")
    public void userFillField(String firstname,String lastname,String email,
                             String password,String address,String city,String state,
                             String zipcode,String country,String mobile,String alias){
        register=new RegistrationPage(driver);
        register.createUserAccount(firstname,lastname,email,password,address,city,state,zipcode,country,mobile,alias);
    }

    @Then("The registration page displayed successfully")
    public void usercanlogout(){
myaccount=new MyAccountPage(driver);
myaccount.userLogout();
    }



}
