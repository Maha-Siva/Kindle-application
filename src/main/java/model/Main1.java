package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.sql.Date;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Formatter;
import java.util.Scanner;
import dao.Admintable1;
//import dao.Kindledao1;
import dao.Usertable1;
//import model.User1;
//import model.Admin1;
//import signin.Login;
//import signin.Register;
public class Main1 {	
		public static void main(String[] args) throws Exception {
					
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			String ss="y";
			while(ss.equals("y")) {
			System.out.println("****KINDLE APP****");
			System.out.println("                                 ");
			//System.out.println("Kindle App" );
			//System.out.println("Hello There! Please Enter Your Id: \n");
			System.out.println("Choose your profile\n");
			System.out.println("*******\n");
			System.out.println("101 - Admin");
			//System.out.println("102 - Author");
			System.out.println("102 - User");
			System.out.println("103 - Exit\n");
			System.out.print("Enter your choice : ");
			//int login = sc.nextInt();
		
			//if(login==101 || login==102 || login==103) {
			
			
			//do {
			
			Scanner s=new Scanner(System.in);
			int ch=s.nextInt();
			switch(ch) {
			case 101:
				while(true) {
					System.out.println("PRESS 1 to ADD books");
					System.out.println("PRESS 2 to DELETE books");
					System.out.println("PRESS 3 to DISPLAY books");
					System.out.println("PRESS 4 to UPDATE books");
					System.out.println("PRESS 5 to EXIT");
					
					System.out.println("Enter the choice");
					
					Scanner sca=new Scanner(System.in);
					int c=sca.nextInt();
					
					if(c == 1) {
						//Add Books
						
						System.out.println("Enter Book id: ");
						int bookid=0;
						String str=sca.next();
						try {
							bookid = Integer.parseInt(str);
						}
						catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Enter Book Name: ");
						String bookname = br.readLine();
						System.out.println("Enter Author Name: ");
						String authorname = br.readLine();
						System.out.println("Enter the no.of pages in the book:");
						String bookpages =br.readLine();  
						//if(authorname!=null) {
						System.out.println("Enter Description: ");
						String description = br.readLine();
						System.out.println("Enter Genre: ");
						String genre = br.readLine();
						System.out.println("Enter if its free(Y/N): ");
						String free = br.readLine();
						String Price =null;
						if((free.equals("Y"))||(free.equals("y"))) {
							Price="0";
						}
						else {
							System.out.println("Enter Price: ");
							Price=br.readLine();
						}
						
						
						//create admin object
						 Admin1 admin = new Admin1(bookid,bookname,authorname,bookpages,description,genre,Price,free);
						boolean ans = Admin1.insertbookrecord(admin);
						if(ans) {
							System.out.println("Book record Inserted Successfully...");
							System.out.println("Book Record:" + admin);
						}else {
							System.out.println("Some error Occured While Inserting...Please try Again!");
						}
						//}
						
					}
					else if(c == 2) {
						//Delete book record
						System.out.println("Enter Book ID To Delete: ");
						int bookid = sc.nextInt();
						boolean f = Admin1.deletebookrecord(bookid);
						if(f) {
							System.out.println("Book Of ID " + bookid + " Record Deleted... ");
						}else {
							System.out.println("Something Went Wrong.. Please try Again!");
						}
					}
					else if(c == 3) {
						//Display books
						
						Admintable1.showAllbookrecords();
					}
					else if(c == 4) {
						System.out.println("Enter book id: ");
						int i=sc.nextInt();
						
						Admintable1.showbookrecords(i);
						//Update student
						System.out.println("PRESS 1 to UPDATE bookname");
						System.out.println("PRESS 2 to UPDATE authorname");
						System.out.println("PRESS 3 to UPDATE description");
						System.out.println("PRESS 4 to UPDATE genre");
						System.out.println("PRESS 5 to UPDATE price");
						System.out.println("PRESS 6 to UPDATE free");
						int val = sc.nextInt();
						if(val == 1) {
							//Update Name
							System.out.println("Enter bookname to UPDATE...");
							String bookname = sca.next();
							
							Admin1 admin= new Admin1();
							admin.setBookname(bookname);
							boolean f = Admin1.updateBookRecord(val,bookname,i,admin);
							if(f) {
								System.out.println("Book Name Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else if(val == 2) {
						
							System.out.println("Enter authorname to UPDATE...");
							String authorname= sca.next();
							
							Admin1 admin = new Admin1();
							admin.setAuthorname(authorname);
							boolean f = Admin1.updateBookRecord(val,authorname,i,admin);
							if(f) {
								System.out.println("Author name Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else if(val == 3) {
							
							System.out.println("Enter description to UPDATE...");
							String description = sca.next();
							Admin1 admin = new Admin1();
							admin.setDescription(description);
							boolean f = Admin1.updateBookRecord(val,description,i,admin);
							if(f) {
								System.out.println("Description Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
	                    else if(val == 4) {
							
							System.out.println("Enter genre to UPDATE...");
							String genre = sca.next();
							
							Admin1 admin = new Admin1();
							admin.setGenre(genre);
							boolean f = Admin1.updateBookRecord(val,genre,i,admin);
							if(f) {
								System.out.println("Genre Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
	                   else if(val == 5) {
							
							System.out.println("Enter price to UPDATE...");
							String Price = sca.next();
						
							Admin1 admin = new Admin1();
							admin.setPrice(Price);
							boolean f = Admin1.updateBookRecord(val,Price,i,admin);
							if(f) {
								System.out.println("Price Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
	                   else if(val == 6) {
							
							System.out.println("Enter free(y/n) to UPDATE...");
							String free = sca.next();
							
							Admin1 admin = new Admin1();
							admin.setFree(free);
							boolean f = Admin1.updateBookRecord(val,free,i,admin);
							if(f) {
								System.out.println("Free Books Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						
						else {
							System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
						}
						
					}
					
					else if(c == 5) {
						
						System.out.println("All changes made!");
						
						break;
					}
					else {
						
					}
					break;
				}
				break;
				
				
				
			case 102:
				while(true) {
					System.out.println("PRESS 1 to ADD User");
					System.out.println("PRESS 2 to DELETE user");
					System.out.println("PRESS 3 to DISPLAY User");
					System.out.println("PRESS 4 to UPDATE User");
					System.out.println("PRESS 5 to EXIT");
					System.out.println("Enter your choice: ");
					
					Scanner sca=new Scanner(System.in);
					int c=sca.nextInt();
					
					if(c == 1) {
						//Add User
						
						System.out.println("Enter User id: ");
						int Userid=0;
						String str=sca.next();
						try {
							Userid = Integer.parseInt(str);
						}
						catch(Exception e) {
							e.printStackTrace();
						} 
						System.out.println("Enter User Name: ");
						String Username = br.readLine();
						System.out.println("Enter Book id: ");
                   int bookid=0;
						String st=sca.next();
						try {
							bookid = Integer.parseInt(st);
						}
						catch(Exception e) {
							e.printStackTrace();
						} 
					
                   System.out.println("Enter the Amount of purchase: ");
						String Price = sca.next();
						System.out.println("Enter Date of purchase: ");
						String Date_of_purchase = sca.next();
						//SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
						//Date regDate=(Date) format.parse(Date_of_purchase);
						//create user  object
						 User1 user = new User1(Userid,Username,bookid,Price,Date_of_purchase);
						boolean ans = User1.insertUserRecord(user);
						if(ans) {
							System.out.println("User record Inserted Successfully...");
							System.out.println("User Record:" + user);
							
						}else {
							System.out.println("Some error Occured While Inserting...Please try Again!");
						}
						
					}
					else if(c == 2) {
						//Delete user record
						System.out.println("Enter User ID To Delete: ");
						int Userid = sc.nextInt();
						boolean f = User1.deleteUserRecord(Userid);
						if(f) {
							System.out.println("Student Of ID " + Userid + " Record Deleted... ");
						}else {
							System.out.println("Something Went Wrong.. Please try Again!");
						}
					}
					else if(c == 3) {
						//Display user
						Usertable1.showAllUserRecords();
					}
					else if(c == 4) {
						System.out.println("Enter User id:");
						int a=sca.nextInt();
						
						Usertable1.showUserRecords(a);
						//Update user
						System.out.println("PRESS 1 to UPDATE Username");
						System.out.println("PRESS 2 to UPDATE Price");
						System.out.println("PRESS 3 to UPDATE Date of purchase");
						
						int val = sc.nextInt();
						if(val == 1) {
							//Update Name
							System.out.println("Enter Username to UPDATE...");
							String Username = sc.next();
							
							User1 user= new User1();
							user.setUsername(Username);
							boolean f = User1.updateUserRecord(val,Username,a,user);
							if(f) {
								System.out.println("Book Name Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else if(val == 2) {
						
							System.out.println("Enter Price to UPDATE...");
							String Price= sc.next();
							
							User1 user = new User1();
							user.setPrice(Price);
							boolean f = User1.updateUserRecord(val,Price,a,user);
							if(f) {
								System.out.println("Price Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
						else if(val == 3) {
							
							System.out.println("Enter Date of purchase to UPDATE...");
							String Date_of_purchase = sc.next();
							/*DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
							String text = df.format(Date_of_purchase);*/
							
							
							User1 user = new User1();
							user.setDate_of_purchase(Date_of_purchase);
							boolean f = User1.updateUserRecord(val,Date_of_purchase,a,user);
							if(f) {
								System.out.println("Date of purchase Updated Successfully...");
							}else {
								System.out.println("Something Went Wrong Please try Again!");
							}
						}
	                    
						else {
							System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
						}
						
					}
					
					else if(c == 5) {
						
						System.out.println("All changes made!");
						
						break;
					}
					//else {
						
					//}
					break;
				}
			
			case 103:
				while(true) {
				System.out.println("Thank You");
				break;
				}
			}
			System.out.println("Do you want to continue press y/n");
			ss=sc.next();
			}
			}
			
			
	}

