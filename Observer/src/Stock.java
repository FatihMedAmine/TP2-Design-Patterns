import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private int quantity;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Méthode pour ajouter un observateur
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Méthode pour supprimer un observateur
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifier tous les observateurs
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    // Setter de la quantité (avec notification automatique)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        System.out.println("Quantité mise à jour : " + this.quantity);
        notifyObservers();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
