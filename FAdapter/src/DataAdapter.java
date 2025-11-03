import java.util.HashMap;
import java.util.Map;

public class DataAdapter {
    private InternalData internalData;

    public DataAdapter(InternalData internalData) {
        this.internalData = internalData;
    }

    public Map<String, Object> toExternalFormat() {
        Map<String, Object> externalData = new HashMap<>();
        externalData.put("first_name", internalData.getPrenom());
        externalData.put("last_name", internalData.getNom());
        externalData.put("age", internalData.getAge());
        return externalData;
    }
}
