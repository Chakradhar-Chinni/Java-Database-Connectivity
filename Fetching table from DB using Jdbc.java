package com.youtube.jdbc;
import java.sql.*;

public class Aclass 
{
	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3309/javaep";
		String uname = "root";
		String pass = "admin";
		String query = "SELECT * FROM student";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			String data = rs.getInt(1)+":"+rs.getString(2);
			System.out.println(data);			
		}
		
		st.close();
		con.close();
	}
}
