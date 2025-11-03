

class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private String connectionString;

    private DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DatabaseConnection getInstance(String connectionString) {
        if (instance == null) {
            instance = new DatabaseConnection(connectionString);
        }
        return instance;
    }

    public Object selectFromDB(String query) {
        // Simulate a database select operation
        System.out.println("Executing query: " + query);
        return new Object();
    }

    public void insertIntoDB(String query) {
        // Simulate a database insert operation
        System.out.println("Executing insert: " + query);
    }
}