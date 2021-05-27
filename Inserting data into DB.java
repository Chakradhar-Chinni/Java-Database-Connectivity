package com.youtube.jdbc;
import java.sql.*;

public class Aclass 
{
	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3309/javaep";
		String uname = "root";
		String pass = "admin";
		String query = "INSERT INTO student values(10,'Palermo')";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count+"row/s affected/");
		
		st.close();
		con.close();
	}
}
