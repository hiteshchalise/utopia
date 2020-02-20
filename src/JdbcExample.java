import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) {
        String query = "SELECT * FROM book;";

        try {
            // Registering driver.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establishing connection.
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb",
                    "root",
                    "pass");

            // Creating statement.
            Statement stmt = conn.createStatement();

            // Executing Query
            ResultSet resultSet = stmt.executeQuery(query);

            // Using the result.
            while (resultSet.next()) {
                int columnCount = resultSet.getMetaData().getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    System.out.print(resultSet.getObject(i + 1) + " ");
                }
                System.out.println();
            }

            // Closing statement and connection.
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
