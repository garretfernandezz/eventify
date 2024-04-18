/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author garre
 */
public class tables {
    public static void main(String[] args){
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            
            //st.executeUpdate("CREATE TABLE appuser(appuser_pk INT AUTO_INCREMENT PRIMARY KEY, userRole VARCHAR(200), name VARCHAR(100), dob VARCHAR(50), mobileNumber VARCHAR(50), email VARCHAR(200), username VARCHAR(200), password VARCHAR(50), address VARCHAR(200) )");
           
            //st.executeUpdate("insert into appuser(userRole, name, dob, mobileNumber, email, username, password, address) VALUES('Admin', 'Admin',16-12-1992,'0000111122', 'admin@gmail.com', 'admin', 'admin', 'India')");
            //st.executeUpdate("CREATE TABLE events(eventID varchar(200) PRIMARY KEY, name VARCHAR(100), faculty varchar(100), venue varchar(50), decription varchar(100), date varchar(100))");
            //st.executeUpdate("drop table sponsors ");
              
            

            st.executeUpdate("CREATE TABLE sponsors(sponsorID int AUTO_INCREMENT primary key, name varchar(200), mobileNumber VARCHAR(100), email VARCHAR(200), amount int, event varchar(200), foreign key(event) references events(eventID), description varchar(500))");
            JOptionPane.showMessageDialog(null, "Table Create Successfully!");
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        
    }
}
