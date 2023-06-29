package task2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Methods {

	public static void insert() {

		Connection con = null;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter name here......");
			String name = sc.next();

			System.out.println("enter email here......");
			String email = sc.next();
			System.out.println("enter sal here.....");
			int sal = sc.nextInt();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

			CallableStatement cs = con.prepareCall("{call insert_data(?,?,?)}");

			cs.setString(1, name);
			cs.setString(2, email);
			cs.setInt(3, sal);

			cs.executeUpdate();
			System.out.println("Data added successfully.......");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void update() {
		Connection con = null;
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your id for update your details.....");
			int Id = sc.nextInt();

			System.out.println("update your name.....");
			String name = sc.next();

			System.out.println("update your email.....");
			String email = sc.next();
			System.out.println("update your sal.....");
			int sal = sc.nextInt();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

			CallableStatement cs = con.prepareCall("{call update_userinput (?,?,?,?)}");

			cs.setString(1, name);
			cs.setString(2, email);
			cs.setInt(3, sal);
			cs.setInt(4, Id);

			cs.executeUpdate();
			System.out.println("Data updated successfully........");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	};

	public static void delete() {
		Connection con = null;
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your id for delete your details.....");
			int Id = sc.nextInt();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

			CallableStatement cs = con.prepareCall("{call Delete_userinput (?)}");

			cs.setInt(1, Id);

			cs.executeUpdate();
			System.out.println("Data Deleted successfully........");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	};

	public static void select() {
		Connection con = null;
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your id for select.....");
			int Id = sc.nextInt();

		

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");

			CallableStatement cs = con.prepareCall("{call Select_Data (?)}");


			cs.setInt(1, Id);

			ResultSet rs = cs.executeQuery();
			rs.next();
			{

				System.out.println(rs.getInt("Id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getInt("sal"));
				
				
			}
			;
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	

public static void selectall(){
	Connection con = null;
	try{  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for selectall.....");
		int Id = sc.nextInt();
		
	
	
	
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
		
		CallableStatement cs = con.prepareCall("{call Selectall_userinput (?)}");

	
		
		ResultSet rs= cs.executeQuery();  
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
