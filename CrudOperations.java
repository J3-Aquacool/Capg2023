
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
 
/**
 * This program demonstrates how to make database connection to PostgreSQL
 * server using JDBC.
 * @author www.codejava.net
 *
 */
public class CrudOperations {
 
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // create three connections to three different databases on localhost
        Connection conn2 = null;
 
       
            // Connect method #1
            // Connect method #2
            
       Class.forName("org.postgresql.Driver");
       
      /*  Class.forName("com.mysql.jdbc.Driver");// mysql 5
        
        Class.forName("com.mysql.cj.jdbc.Driver");// mysql 8
        
        Class.forName("oracle.jdbc.driver.OracleDriver");// mysql 5
        */
        
        
        
            conn2 = DriverManager.getConnection("jdbc:postgresql://localhost/studentdb","postgres", "admin");
            
                    
            
            Statement st=conn2.createStatement();
            st.executeUpdate("insert into student values(100,'aaa')");
            System.out.println("Data added");
          
        }
    
}