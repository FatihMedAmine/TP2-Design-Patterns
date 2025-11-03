public class App {
    public static void main(String[] args) throws Exception {
        Stock stock = new Stock("Ordinateur Portable", 10);

        // Création des observateurs
        EmailNotificationObserver emailObs = new EmailNotificationObserver();
        UIUpdateObserver uiObs = new UIUpdateObserver();
        DailyReportObserver reportObs = new DailyReportObserver();

        // Abonnement des observateurs
        stock.addObserver(emailObs);
        stock.addObserver(uiObs);
        stock.addObserver(reportObs);

        // Simuler des changements
        stock.setQuantity(8);
        stock.setQuantity(4);
        stock.setQuantity(12);

        // Générer le rapport quotidien
        reportObs.generateReport();
    }
}
