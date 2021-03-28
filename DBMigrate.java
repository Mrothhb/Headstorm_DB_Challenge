import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

import java.io.IOException;
/**
 * simulate the input of JSON formatted as list of numbers.
 *
 */
public class DBMigrate {
    public static void main(String[] args) throws IOException, ParseException {
        StringBuffer sql = new StringBuffer();
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("C:\\Users\\Matt\\Desktop\\HeadStormDBChallenge\\src\\testJson"));
        JSONArray json = (JSONArray) obj;

        for(int i = 0; i < json.size(); i++) {
            JSONObject object = (JSONObject) json.get(i);
           String name = (String) object.get("Name");
           long id = (long) object.get("Record ID");
           NewDataModel data = new NewDataModel(name, id);
           System.out.println(data);
        }



    }

}

class NewDataModel {
    private String name;
    private long id;

    public NewDataModel(
            String name,
            //   int id
            long id){
        this.name =name;
        this.id = id;
    }

}



