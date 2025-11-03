public class App {
    public static void main(String[] args) throws Exception {

        // lancer timer
        long startTime = System.currentTimeMillis();

        DatabaseConnection dbConnection = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydb");

        long endTime = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();

        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydb");

        long endTime2 = System.currentTimeMillis();
        System.out.println("\nOpération 1 a pris " + (endTime - startTime) + " millisecondes.");
        System.out.println("\nOpération 2 a pris " + (endTime2 - startTime2) + " millisecondes.");

        if (dbConnection == dbConnection2) {
            System.out.println("Les deux instances sont identiques. Le pattern Singleton fonctionne !");
        } else {
            System.out.println("Les instances sont différentes. Le pattern Singleton a échoué !");
        }

        // Effectuer une opération SELECT
        Object result = dbConnection.selectFromDB("SELECT * FROM users");
        System.out.println("Opération de sélection terminée.");

        // Effectuer une opération INSERT
        dbConnection.insertIntoDB("INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com')");
        System.out.println("Opération d'insertion terminée.");
    }
}
