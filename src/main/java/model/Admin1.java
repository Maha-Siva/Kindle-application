package model;

import java.sql.SQLException;

import dao.Admintable1;

public class Admin1 {
	private int bookid;
	private String bookname;
	private String authorname;
	private String bookpages;
	private String description;
	private String genre;
	private String Price;
	private String free;
	
	public Admin1(int bookid, String bookname, String authorname,String bookpages, String description, String genre, String Price, String free) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.bookpages = bookpages;
		this.description = description;
		this.genre = genre;
		this.Price = Price;
		this.free = free;
	}

	
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getBookpages() {
		return bookpages;
	}
	public void setBookpages(String bookpages) {
		this.bookpages = bookpages;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String Price) {
		this.Price = Price;
	}
	public String getFree() {
		return free;
	}
	public void setFree(String free) {
		this.free = free;
	}
	
	public static boolean insertbookrecord(Admin1 admin) {
		// TODO Auto-generated method stub
		boolean b=false;
		Admintable1 dd;
		try {
			dd = new Admintable1();
			b=dd.insertbookrecord(admin);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
	
	public static boolean updateBookRecord(int val,String toUpdate,int bookid,Admin1 admin) {
		boolean b=false;
		Admintable1 dd;
		try {
			dd = new Admintable1();
			b=dd.updateBookRecord(val,toUpdate,bookid,admin);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
	
	public static void showAllbookrecords() throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		
	}

	public Admin1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static boolean deletebookrecord(int bookid) {
		boolean b=false;
		Admintable1 dd;
		try {
			dd = new Admintable1();
			b=dd.deletebookrecord(bookid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
}