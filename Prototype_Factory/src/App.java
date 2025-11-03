public class App {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        // 1) Créer des documents via la factory
        Report report = (Report) factory.createDocument("report");
        report.setTitle("Rapport Annuel 2025");
        report.setAuthor("Fatih");
        report.setContent("Analyse annuelle des performances.");
        report.addSection("Introduction");
        report.addSection("Données");
        report.addSection("Conclusion");

        Contract contract = (Contract) factory.createDocument("contract");
        contract.setTitle("Contrat de Prestation");
        contract.setAuthor("Société X");
        contract.setContent("Objet du contrat : ...");
        contract.setClause("Clause de confidentialité");

        Invoice invoice = (Invoice) factory.createDocument("invoice");
        invoice.setTitle("Facture Client");
        invoice.setAuthor("Société X");
        invoice.setContent("Détails facturation");
        invoice.setAmount(1234.56);

        // Affichage initial
        System.out.println("=== Documents originaux ===");
        System.out.println(report);
        System.out.println(contract);
        System.out.println(invoice);

        // 2) Clonage (Prototype)
        Report clonedReport = (Report) report.clone();
        Contract clonedContract = (Contract) contract.clone();
        Invoice clonedInvoice = (Invoice) invoice.clone();

        // 3) Modifier les originaux pour prouver que le clone est indépendant
        report.addSection("Annexe A");               // modifie l'original -> clone ne doit pas avoir cette section
        contract.setClause("Clause modifiée");       // modifie l'original
        invoice.setAmount(9999.99);                  // modifie l'original

        // 4) Afficher après modifications
        System.out.println("\n=== Après modifications de l'original ===");
        System.out.println("Original Report: " + report);
        System.out.println("Cloned Report  : " + clonedReport);

        System.out.println("Original Contract: " + contract);
        System.out.println("Cloned Contract  : " + clonedContract);

        System.out.println("Original Invoice: " + invoice);
        System.out.println("Cloned Invoice  : " + clonedInvoice);

        // 5) Vérifier indépendance de la liste (deep copy)
        System.out.println("\n=== Vérifications supplémentaires ===");
        System.out.println("Report original sections == cloned sections ? " +
                (report.getSections() == clonedReport.getSections()));
        System.out.println("Report original sections equals cloned sections ? " +
                report.getSections().equals(clonedReport.getSections()));
    }
}
