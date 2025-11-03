public class UIUpdateObserver implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("[UI] Interface mise à jour pour le produit '" 
            + stock.getName() + "' : quantité actuelle = " + stock.getQuantity());
    }
}
