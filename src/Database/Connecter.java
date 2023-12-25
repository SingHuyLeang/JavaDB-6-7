package Database;

import java.sql.*;

public class Connecter {
    protected PreparedStatement ps;
    protected ResultSet rs;
    static public Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_manager","root","");
            if (con==null) {
                System.out.println("Connection Fail");
            } else {
                System.out.println("Connection Suceess");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
