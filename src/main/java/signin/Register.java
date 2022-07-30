package signin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import dao.Kindledao1;

public class Register extends Kindledao1 {

	private static Connection con;

    public Register() throws ClassNotFoundException, SQLException {
    	con = Kindledao1.getCon();
    	
    }
    
	public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.println("Registration Page");
      System.out.println("------------------");
      System.out.println("Enter your Name :");
      String name = sc.nextLine();
      System.out.println("Enter Username :");
      String username = sc.nextLine();
      System.out.println("Enter your Email ID :");
      String email = sc.nextLine();
      System.out.println("Enter a Password :");
      String password = sc.nextLine();
      Connection con = getCon();
      PreparedStatement ps = null;
      String b = "insert into register(name,Username,email,Password)values(?,?,?,?);";
      ps = con.prepareStatement(b);

      ps.setString(1, name);
      ps.setString(2, username);
      ps.setString(3, email);
      ps.setString(4, password);
      ps.executeUpdate();
      System.out.println("Registration is Successfully Completed.");
      Login p = new Login();
      p.main(null);
      
	}

}