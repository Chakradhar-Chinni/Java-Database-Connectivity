package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class E 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		String url = "jdbc:mysql://localhost:3309/javaep";
		String uname = "root";
		String pass  = "admin";
		
		System.out.print("\nEnter Name");
		String Name = sc.nextLine();
		
		System.out.print("Enter id");
		int student_id = sc.nextInt();


		String query = "INSERT INTO student VALUES(?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,student_id);
		st.setString(2,Name);
		
		int r = st.executeUpdate();
		System.out.println(r+" row/s affected");
		
			
	}
}
