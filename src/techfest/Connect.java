package techfest;
import java.sql.*;
public class Connect {
    Connection con;
    Statement stmt;
    public void create_Connect() throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","haseen","haseen");
        stmt=con.createStatement();
    }
    Statement return_statement()
    {
        return stmt;
    }
}
