package tests;

import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class OrderDetailsTest extends BaseTest {
    HomePage homeObj;
    LoginPage loginObj;
    MyAccountPage myaccountObj;
    BlousesPage blousesObj;
    ShoppingCartPage shoppingObj;


    @Test(priority = 1)
    public void userCanAddBlousestoCart() throws IOException, ParseException {

        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        blousesObj = new BlousesPage(driver);
        Assert.assertTrue(blousesObj.resultedProduct.getText().contains("There is 1 product."));
        blousesObj.addBlouseToCart(jsonReader.quantity, jsonReader.size);
        Assert.assertTrue(blousesObj.sucssessMsg.getText().contains("Your shopping cart contains:"));
    }
        @Test(priority = 2)
        public void UserCanCheckout() throws IOException, ParseException {
            JsonDataReader jsonReader = new JsonDataReader();
            jsonReader.JsonReader();
            shoppingObj = new ShoppingCartPage(driver);
            shoppingObj.openSignIn();
            shoppingObj.confirmAddress();
            shoppingObj.openPayment();
            shoppingObj.UserOpenBankWire();
            Assert.assertTrue(shoppingObj.totalprice.getText().contains("The total amount of your order comes to: $56.00"));
            Assert.assertTrue(shoppingObj.dollarcurrancy.getText().equals("Dollar"));
            shoppingObj.userConfirmOrder();
            Assert.assertTrue(shoppingObj.confirmationMsg.getText().contains("Your order on My Store is complete."));
        }


    }

