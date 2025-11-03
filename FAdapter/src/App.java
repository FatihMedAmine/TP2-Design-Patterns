import java.util.Map;

public class App {
    public class Main {
        public static void main(String[] args) {
            InternalData data = new InternalData("Amine", "Fatih", 21);

            DataAdapter adapter = new DataAdapter(data);
            Map<String, Object> donneesConverties = adapter.toExternalFormat();

            ExternalAPI api = new ExternalAPI();
            api.sendData(donneesConverties);

            JSONAdapter jsonAdapter = new JSONAdapter(data);
            System.out.println("Données au format JSON : " + jsonAdapter.toJson());

            XMLAdapter xmlAdapter = new XMLAdapter(data);
            System.out.println("Données au format XML : " + xmlAdapter.toXml());
        }
    }
}
