package com.youtube.jdbc;
import java.sql.*;

public class Aclass 
{
	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3309/javaep";
		String uname = "root";
		String pass = "admin";
		int student_id = 12;
		String Name = "Arya";
		String query = "INSERT INTO student values (?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,student_id);
		st.setString(2, Name);
		int count = st.executeUpdate();
		
		System.out.println(count+"row/s affected/");
		
		st.close();
		con.close();
	}
}
