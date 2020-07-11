package data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
    public String firstname, lastname, email,
            password, address, city, state,
            zipcode, country, mobile, alias, quantity, size;

    public void JsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/data/data.json";

        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcFile));

        for (Object jsonObj : jarray) {
            JSONObject person = (JSONObject) jsonObj;
            firstname = (String) person.get("firstname");
            System.out.println(firstname);

            lastname = (String) person.get("lastname");
            System.out.println(lastname);

            email = (String) person.get("email");
            System.out.println(email);

            password = (String) person.get("password");
            System.out.println(password);

            address = (String) person.get("address");
            System.out.println(address);

            city = (String) person.get("city");
            System.out.println(city);

            state = (String) person.get("state");
            System.out.println(state);

            zipcode = (String) person.get("zipcode");
            System.out.println(zipcode);

            country = (String) person.get("country");
            System.out.println(country);

            mobile = (String) person.get("mobile");
            System.out.println(mobile);

            alias = (String) person.get("alias");
            System.out.println(alias);

            quantity = (String) person.get("quantity");
            System.out.println(quantity);

            size = (String) person.get("size");
            System.out.println(size);


        }

    }

}
