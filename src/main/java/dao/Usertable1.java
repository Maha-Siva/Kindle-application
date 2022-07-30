package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.Kindledao1;
import model.User1;


	
	public class Usertable1 extends Kindledao1{
		private static Connection con;

	    public Usertable1() throws ClassNotFoundException, SQLException {
	    	con = Kindledao1.getCon();
	    	
	    	
	    }
	    public static boolean insertUserRecord(User1 user) {
			boolean f = false;
			try {
				System.out.println(user.getUsername());
				PreparedStatement ps = con.prepareStatement("insert into user(Userid,Username,bookid,Price,Date_of_purchase)values(?,?,?,?,?)");
	            
	            ps.setInt(1, user.getUserid());
	            ps.setString(2, user.getUsername());
	            ps.setInt(3, user.getBookid());
	            ps.setString(4, user.getPrice());
	            ps.setString(5, user.getDate_of_purchase());
	         
	            

		           int i= ps.executeUpdate();
		           if(i>0) {
		        	   return true;
		           }
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return f;
		}
	    public static boolean deleteUserRecord(int Userid) {
			// TODO Auto-generated method stub
			boolean f = false;
			try {
				String query = "delete from user where userid=?";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1, Userid);
				
				//execute..
				pstmt.executeUpdate();
				
				f = true;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return f;
			
		
		}
	    public static void showAllUserRecords() { 
			
		
			try {
				con = Kindledao1.getCon();
				String query = "select * from user";
				Statement st = con.createStatement();
				ResultSet set = st.executeQuery(query);
				
				while(set.next()) {
					int Userid = set.getInt(1);
					String Username = set.getString(2);
					int bookid  = set.getInt(3);
					String Price = set.getString(4);
					String Date_of_purchase = set.getString(5);
									
					
					System.out.println("\nUserID : " + Userid + " \nUser Name : " + Username + " \nBook id : " + bookid + " \nPrice : " + Price + "\nDate of purchase : " + Date_of_purchase);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		

	public static boolean updateUserRecord(int val,String toUpdate,int Userid,User1 user) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			 
			 if(val == 1) {
					
					
						String query = "update user set Username=? where Userid=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, Userid);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
				
					String query = "update user set Price=? where Userid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, Userid);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
			
				else if(val == 3) {
					String query = "update user set Date_of_purchase=? where Userid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, Userid);
					
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
	// TODO Auto-generated method stub

	}
	public static void showUserRecords(int a) {
		try {
			con = Kindledao1.getCon();
			String query = "select * from user where Userid= " +a;
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int Userid = set.getInt(1);
				String Username = set.getString(2);
				int bookid  = set.getInt(3);
				String Price = set.getString(4);
				String Date_of_purchase = set.getString(5);
								
				
				System.out.println("UserID: " + Userid + " \n User Name: " + Username + " \nBook id: " + bookid + " \nPrice:" + Price + "Date of purchase:" + Date_of_purchase);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	}


