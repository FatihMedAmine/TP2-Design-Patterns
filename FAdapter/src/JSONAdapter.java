import com.google.gson.Gson;

public class JSONAdapter extends DataAdapter {
    public JSONAdapter(InternalData data) {
        super(data);
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(toExternalFormat());
    }
}
