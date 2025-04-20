import java.sql.*;

public class InsertEmployee {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String user = "root"; // Replace with your DB username
        String pass = "root"; // Replace with your DB password
        try {
            // Load MySQL JDBC driver (optional for JDBC 4+)
            // Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to the database.");
            // Prepare SQL insert
            String sql = "INSERT INTO student (id, name, age) VALUES (?, ?, ?)";
            Statement stmt = conn.createStatement();

            //create table stmt
            String createTableSQL = "CREATE TABLE IF NOT EXISTS student1 (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age INT, dept VARCHAR(50), marks INT)";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table created successfully.");
            // Insert data
            String insertSQL = "INSERT INTO student1 (name, age, dept, marks) VALUES ('John Doe', 20, 'Computer Science', 85)";
            stmt.executeUpdate(insertSQL);
            System.out.println("Data inserted successfully.");
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM student1");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String dept = rs.getString("dept");
                int marks = rs.getInt("marks");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Dept: " + dept + ", Marks: " + marks);
            }

            // Clean up
            stmt.close();
            conn.close();
            rs.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
