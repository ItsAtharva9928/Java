import java.sql.*;

public class InsertEmployee {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String user = "root"; // Replace with your DB username
        String pass = "root"; // Replace with your DB password

        // Data to insert
        int id = 101;
        String name = "Marla Singer";
        int age = 20;

        try {
            // Load MySQL JDBC driver (optional for JDBC 4+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, pass);

            // Prepare SQL insert
            String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set parameters
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);

            // Execute insert
            int rows = stmt.executeUpdate();
            System.out.println(rows + " row(s) inserted.");

            // Clean up
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
