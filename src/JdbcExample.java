import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "INSERT INTO book(id, author, title, price) VALUES(1, 'one', 'author', 122)";
        String query2 = "INSERT INTO book(id, author, title, price) VALUES(1, 'one', 'author', 122)";
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb",
                "root",
                "pass");
        Statement stmt = conn.createStatement();
        stmt.execute(query);
        stmt.execute(query2);

        stmt.close();
        conn.close();
    }
}
