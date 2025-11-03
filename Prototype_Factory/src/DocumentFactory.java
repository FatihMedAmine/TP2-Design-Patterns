public class DocumentFactory {

    public Document createDocument(String type) {
        switch (type.toLowerCase()) {
            case "report":
                return new Report("Nouveau Rapport", "Auteur Inconnu", "Contenu initial");
            case "contract":
                return new Contract("Nouveau Contrat", "Auteur Inconnu", "Contenu initial",
                        "Partie A", "Partie B", "Clause standard");
            case "invoice":
                return new Invoice("Nouvelle Facture", "Auteur Inconnu", "Contenu initial",
                        "INV-0001", 0.0);
            default:
                throw new IllegalArgumentException("Type inconnu : " + type);
        }
    }
}
