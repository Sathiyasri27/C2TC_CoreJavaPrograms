import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLReadExample {

		public static void main(String[] args) {
	        // Database credentials
	        String url = "jdbc:postgresql://localhost:5432/Student1"; // Change database name
	        String user = "postgres"; // Change to your PostgreSQL username
	        String password = "sath"; // Change to your PostgreSQL password
	        
	        // JDBC variables
	        Connection conn = null;
	        Statement stmt = null;
	        ResultSet rs = null;

	        try {
	            // Load PostgreSQL JDBC Driver
	            Class.forName("org.postgresql.Driver");

	            // Establish Connection
	            conn = DriverManager.getConnection(url, user, password);

	            // Create Statement
	            stmt = conn.createStatement();

	            // Execute Query
	            String query = "SELECT * FROM employee";
	            rs = stmt.executeQuery(query);

	            // Process the result set
	            System.out.println("Employee Details:");
	            System.out.println("--------------------------------------");
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String city= rs.getString("city");

	                System.out.println("ID: " + id + ", Name: " + name + ", City: " + city );
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close resources
	            try {
	                if (rs != null) rs.close();
	                if (stmt != null) stmt.close();
	                if (conn != null) conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }


}