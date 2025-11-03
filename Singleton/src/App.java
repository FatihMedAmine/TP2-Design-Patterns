public class App {
    public static void main(String[] args) throws Exception {

        DatabaseConnection dbConnection = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydb");

        // Perform a select operation
        Object result = dbConnection.selectFromDB("SELECT * FROM users");
        System.out.println("Select operation completed.");

        // Perform an insert operation
        dbConnection.insertIntoDB("INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com')");
    }
}
