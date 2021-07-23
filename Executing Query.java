import java.sql.*;

public class Aclass 
{
	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3309/javaep";
		String uname = "root";
		String pass = "admin";
		String query = "SELECT Name FROM STUDENT where student_id=3";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		String name = rs.getString("Name");
		System.out.println(name);
		
		st.close();
		con.close();
	}
}

//-------------------------
//-------------------------
package jdbc;
import java.sql.*;
public class B 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3309/javaep";
		String uname = "root";
		String upwd = "admin";
		String query = "Select * from student WHERE student_id=2";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,upwd);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query); 
		rs.next();
		
		String data = rs.getString(2)+" : "+rs.getInt(1);                                       
		System.out.println(data);
	}
}
