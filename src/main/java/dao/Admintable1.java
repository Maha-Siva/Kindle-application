package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Kindledao1;
import model.Admin1;

	
	public class Admintable1 extends Kindledao1{
		private static Connection con;

	    public Admintable1() throws ClassNotFoundException, SQLException {
	    	con = Kindledao1.getCon();
	    	
	    	
	    }
	    public static boolean insertbookrecord(Admin1 admin) {
			boolean f = false;
			try {
				PreparedStatement ps = con.prepareStatement("insert into admin(bookid,bookname,authorname,bookpages,description,genre,price,free)values(?,?,?,?,?,?,?,?)");
	            
	            ps.setInt(1, admin.getBookid());
	            ps.setString(2, admin.getBookname());
	            ps.setString(3, admin.getAuthorname());
	            ps.setString(4, admin.getBookpages());
	            ps.setString(5, admin.getDescription());
	            ps.setString(6, admin.getGenre());
	            ps.setString(7, admin.getPrice());
	            ps.setString(8, admin.getFree());
	            
	           

	           int i= ps.executeUpdate();
	           if(i>0) {
	        	   return true;
	           }

	          //  System.out.println("Inserted record successfully...");
	          //  return true;
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return f;
		}
	    public static boolean deletebookrecord(int bookid) {
			// TODO Auto-generated method stub
			boolean f = false;
			try {
				String query = "delete from admin where bookid=?";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1, bookid);
				
				//execute..
				int i=pstmt.executeUpdate();
				
				if(i>0) {
					return true;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return f;
			
		
		}
	    public static void showAllbookrecords() { 
						
		
			try {
				con = Kindledao1.getCon();
				String query = "select * from admin";
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet set = ps.executeQuery();
				
				System.out.println(set.next());
				
				while(set.next()) {
					int bookid = set.getInt(1);
					String bookname = set.getString(2);
					String authorname  = set.getString(3);
					String bookpages = set.getString(4);
					String description = set.getString(5);
					String genre = set.getString(6);
					String price =set.getString(7);
					String free= set.getString(8);				
					
					System.out.println("Book ID: " + bookid + " \nBook Name: " + bookname + " \nAuthor name: " + authorname+ "\nNo.of pages" +bookpages+  " \nDescription: " + description + "\nGenre:" + genre + "\nPrice:" + price + "\nFree:" + free);
					
					System.out.println("----------------------------------------------");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		

	public static boolean updateBookRecord(int val,String toUpdate,int bookid,Admin1 admin) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			 
			 if(val == 1) {
					
					
						String query = "update admin set bookname=? where bookid=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, bookid);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
				
					String query = "update admin set authorname=? where bookid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, bookid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
				
					String query = "update admin set description=? where bookid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, bookid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
			
				else if(val == 4) {
					String query = "update admin set genre=? where bookid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, bookid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 5) {
					String query = "update admin set price=? where bookid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, bookid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 6) {
					String query = "update admin set free=? where bookid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, bookid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				} 
				else{
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}

	
	public static void main(String[] args) {
		

	}
	public static void showbookrecords(int i) {
		try {
			con = Kindledao1.getCon();
			String query = "select * from admin where bookid="+i;
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);
			
			//System.out.println(set.next());
			
			if(set.next()) {
				int bookid = set.getInt(1);
				String bookname = set.getString(2);
				String authorname  = set.getString(3);
				String description = set.getString(4);
				String genre = set.getString(5);
				String price =set.getString(6);
				String free= set.getString(7);				
				
				System.out.println("Book ID: " + bookid + " \n Book Name: " + bookname + " \nAuthor name: " + authorname+ " \nDescription: " + description + "\nGenre:" + genre + "\nPrice:" + price + "\nFree:" + free);
				
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
