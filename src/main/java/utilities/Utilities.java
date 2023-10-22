package utilities;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utilities {

    public static XmlPath RawToXML(Response res) {

        String response = res.asString();
        XmlPath x = new XmlPath(response);
        return x;
    }

    public static JsonPath RawToJSON (Response res) {

        String response = res.asString();
        JsonPath x = new JsonPath(response);
        return x;
    }

    public static String graphqlToJsonString(String payload){
        JSONObject json = new JSONObject();
        json.put("query", payload);
        return  json.toString();
    }

    public static String graphqlWithVariablesToJsonString(String payload, String variables){
        JSONObject json = new JSONObject();
        json.put("query", payload);
        json.put("variables", variables);
        return json.toString();
    }

    private static Properties prop;

    public static void loadGraphQls() {
        prop = new Properties();

        try (InputStream input = Utilities.class.getClassLoader().getResourceAsStream("graphql_queries.properties")) {
            if (input == null) {
            }

            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getQuery(String key) {
        if(prop == null){
            loadGraphQls();
        }
        return prop.getProperty(key);
    }


}
