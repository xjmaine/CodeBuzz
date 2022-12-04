import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DataConnect {
    
    public static void main(String[] args) throws java.sql.SQLException{
        connectData();
    }

    static void connectData() throws java.sql.SQLException {
        //connection string
        try {
            Class.forName("sun.jdbc.odbc.jdbcOdbDriver");

            Connection conn = DriverManager.getConnection("jdbc:odbc:demo", "", "");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from task");
            int rows =0;

            while(rs.next()){
                rows++;
                System.out.println(rs.getString(3) + "\t");
                conn.close();
                rs.close();
            }
        } catch (Exception e){
            System.out.println("Connection Error");
        }
    }
}