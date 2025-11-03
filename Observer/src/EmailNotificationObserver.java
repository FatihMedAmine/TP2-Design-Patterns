public class EmailNotificationObserver implements Observer {
    @Override
    public void update(Stock stock) {
        if (stock.getQuantity() < 5) {
            System.out.println("[Email] Alerte : Le stock du produit '" 
                + stock.getName() + "' est bas (" + stock.getQuantity() + ")");
        }
    }
}
