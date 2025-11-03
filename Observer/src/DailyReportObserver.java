import java.util.ArrayList;
import java.util.List;

public class DailyReportObserver implements Observer {
    private List<String> changes = new ArrayList<>();

    @Override
    public void update(Stock stock) {
        String change = "Produit: " + stock.getName() + ", nouvelle quantité: " + stock.getQuantity();
        changes.add(change);
        System.out.println("[Rapport] Enregistré : " + change);
    }

    public void generateReport() {
        System.out.println("\n--- Rapport quotidien ---");
        for (String entry : changes) {
            System.out.println(entry);
        }
        System.out.println("---------------------------\n");
    }
}
