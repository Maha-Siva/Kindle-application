package signin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import dao.Kindledao1;
import model.Main1;
public class Login extends Kindledao1{
	
	
	  private static Connection con;
	  
	  public Login() throws ClassNotFoundException, SQLException { con =
	  Kindledao1.getCon(); 
	 }
	 
	
      public static void login() throws Exception {
    	  Login p = new Login();
    	  Scanner b = new Scanner(System.in);
          Main1 m = new Main1();
          while(true) {
    	  System.out.println("Login");
    	  System.out.println("------");
    	  System.out.println("Enter your Username :");
         String username = b.nextLine();
         System.out.println("Enter your Password :");
         String password = b.nextLine();
         String ab = "select Username, Password from register where Username =? and Password=?";
         PreparedStatement ps = getCon().prepareStatement(ab);
         ps.setString(1,username);
         ps.setString(2, password);
         
         ResultSet rs = ps.executeQuery();
         if(rs.next())
           {
        	  
        	 		 System.out.println("You have Successfully Logged in.");
        	 		 m.main(null);    
       
        }    
         else {
        	 System.out.println("Could not login. Please try Again.");
         }}
      }
      public static void main(String[] args) throws Exception {
        Login l = new Login();
        l.login();      
      }
}