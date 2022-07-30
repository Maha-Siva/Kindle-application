package model;
import java.sql.Date;
import java.sql.SQLException;

import dao.Admintable1;
import dao.Kindledao1;
import dao.Usertable1;

	
	

	public class User1 {
		private int Userid;
		private String Username;
		private int bookid;
		
		private String Price;
		private String Date_of_purchase;
		
		public User1(int Userid, String Username, int bookid, String Price, String Date_of_purchase) {
			super();
			this.Userid = Userid;
			this.Username = Username;
			this.bookid = bookid;
			this.Price = Price;
			this.Date_of_purchase = Date_of_purchase;
			
		}
		public int getUserid() {
			return Userid;
		}

		public void setUserid(int userid) {
			Userid = userid;
		}

		public String getUsername() {
			return Username;
		}

		public void setUsername(String username) {
			Username = username;
		}

		public int getBookid() {
			return bookid;
		}

		public void setBookid(int bookid) {
			this.bookid = bookid;
		}

		public String getPrice() {
			return Price;
		}

		public void setPrice(String price) {
			Price = price;
		}

		public String getDate_of_purchase() {
			return Date_of_purchase;
		}

		public void setDate_of_purchase(String date_of_purchase) {
			Date_of_purchase = date_of_purchase;
		}

		
		
	
		public static boolean insertUserRecord(User1 user) {
			boolean b=false;
			Usertable1 dd;
			try {
				dd = new Usertable1();
				b=dd.insertUserRecord(user);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return b;
			
		}
	
		public static boolean updateUserRecord(int val,String toUpdate,int Userid,User1 user) {
			boolean b=false;
			Usertable1 dd;
			try {
				dd = new Usertable1();
				b=dd.updateUserRecord(val,toUpdate,Userid,user);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return b;
		}
		
		public static void showAllUserRecords() {
			// TODO Auto-generated method stub
			
		}

		public User1() {
			super();
			// TODO Auto-generated constructor stub
		}

		public static boolean deleteUserRecord(int Userid) {
			boolean b=false;
			Usertable1 dd;
			try {
				dd = new Usertable1();
				b=dd.deleteUserRecord(Userid);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return b;
		}
			

//
//		public void setDate_of_purchase1(String text) {
//			// TODO Auto-generated method stub
//			
//		}


		


		

	}


