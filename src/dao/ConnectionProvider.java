
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author garre
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment?useSSL=false","","");
            return con;
        }
        catch (Exception e){
        System.out.println(e);
        return null;
        
    }
    }
}

