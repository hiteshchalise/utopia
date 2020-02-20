import java.sql.*;

public class JdbcExample {

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query = "SELECT * FROM book;";
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb",
                "root",
                "pass");
        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        while(resultSet.next()){
            int i = resultSet.getMetaData().getColumnCount();
            for (int j = 0; j < i; j++) {
                System.out.println("Column: " + j + " data: " + resultSet.getObject(j + 1) );
            }
        }
        stmt.close();
        conn.close();
    }
}
