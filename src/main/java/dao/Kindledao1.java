package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Kindledao1 {
	

	
		public static Connection getCon() throws ClassNotFoundException, SQLException
		{
			Connection con=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kindleb","root","chikku");
			if(con!=null) 
				System.out.println("Connected!!");
			
			return con;
			
		}
		public static void main(String[] args) throws Exception {
			System.out.println(Kindledao1.getCon());
		}
	}
