package task;
import java.sql.*;
import java.util.Scanner;
public class User_Input {


	

		
		public static void add(){
		try{  
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your name.....");
			String name = sc.next();
			
			System.out.println("Enter your email.....");
			String email = sc.next();
			System.out.println("Enter your sal.....");
			int sal = sc.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/user","root","root");
			
			 
			
			PreparedStatement ps=  con.prepareStatement( "insert into userinput (name,email,sal) values(?,?,?)"); 
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3,sal);
			
			int rs= ps.executeUpdate();  
			System.out.println(rs);
		
			con.close();  
			}catch(Exception e){ System.out.println(e);}  };
			  
			
			
			public static void update(){
				try{  
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter your id for update your details.....");
					int Id = sc.nextInt();
					
					System.out.println("update your name.....");
					String name = sc.next();
					
					System.out.println("update your email.....");
					String email = sc.next();
					System.out.println("update your sal.....");
					int sal = sc.nextInt();
				
					Class.forName("com.mysql.cj.jdbc.Driver");  
					
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/user","root","root");
					
					 
					
					PreparedStatement ps=  con.prepareStatement( "update  userinput set name =?,email=?,sal=?  where Id = ?"); 
				
					ps.setString(1, name);
					ps.setString(2, email);
					ps.setInt(3,sal);
					ps.setInt(4,Id);
					
					int rs= ps.executeUpdate();  
					System.out.println(rs);
				
					con.close();  
					}catch(Exception e){ System.out.println(e);}  };
					
					
					 



public static void delete(){
	try{  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id for delete.....");
		int Id = sc.nextInt();
		
	
	
		Class.forName("com.mysql.jdbc.Driver");  
		
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/user","root","root");
		
		 
		
		PreparedStatement ps=  con.prepareStatement( "delete from userinput where Id = ?"); 
	
	
		ps.setInt(1,Id);
		
		int rs= ps.executeUpdate();  
		System.out.println(rs);
	
		con.close();  
		}catch(Exception e){ System.out.println(e) ;  }}



public static void select(){
	try{  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your id for select.....");
		int Id = sc.nextInt();
		
	
	
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/user","root","root");
		
		PreparedStatement ps=  con.prepareStatement( "select * from userinput where id = ?"); 
	
	
		ps.setInt(1,Id);
		
		ResultSet rs= ps.executeQuery();  
		 rs.next(); {
			
		
		System.out.println(rs.getInt("Id"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("email"));
		System.out.println(rs.getInt("sal"));
		};
		con.close();  
		}catch(Exception e){ System.out.println(e) ;  }}




public static void selectall(){
	try{  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for selectall.....");
		int Id = sc.nextInt();
		
	
	
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/user","root","root");
		
		PreparedStatement ps=  con.prepareStatement( "select * from userinput"); 
	
		
		ResultSet rs= ps.executeQuery();  
		while (rs.next()) {
			
		
		System.out.println(rs.getInt("Id"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("email"));
		System.out.println(rs.getInt("sal"));
		};
		con.close();  
		}catch(Exception e){ System.out.println(e) ;
		
		
		}}



}
	

