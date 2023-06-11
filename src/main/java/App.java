import org.json.JSONObject;
import org.json.JSONStringer;

public class App {

    public static void main(String[] args) {
        JSONStringer jsonStringer = new JSONStringer();
        jsonStringer.object();
        jsonStringer.key("name").value("Name");
        jsonStringer.key("surname").value("SurName");
        jsonStringer.endObject();

        String str = jsonStringer.toString();
        JSONObject jsonObject = new JSONObject(str);

        System.out.println("Final JSONObject: " + jsonObject);
    }
}
