package data;

import com.fasterxml.jackson.databind.type.TypeParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sun.rmi.runtime.Log;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class JsonDataReader {

   public String firstname, lastname, email,
            password, address, city, state,
            zipcode, country, mobile, alias, quantity, size;
    public void JsonReader() throws IOException, ParseException {

        String filePath = System.getProperty("user.dir")+"/src/test/java/data/data.json";
        File srcFile = new File(filePath);
        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));

        for(Object jsonObj : jarray)
        {
            JSONObject usersObj = (JSONObject) jsonObj ;
            firstname = (String) usersObj.get("firstname");

             lastname = (String) usersObj.get("lastname");

             email = (String) usersObj.get("email");

             password = (String) usersObj.get("password");

             address = (String) usersObj.get("address");

             city = (String) usersObj.get("city");

             state = (String) usersObj.get("state");

             zipcode = (String) usersObj.get("zipcode");

             country = (String) usersObj.get("country");

             mobile = (String) usersObj.get("mobile");

             alias = (String) usersObj.get("alias");

             quantity = (String) usersObj.get("quantity");

             size = (String) usersObj.get("size");
             System.out.println(firstname);
             System.out.println(lastname);
             System.out.println(email);

        }
}
}