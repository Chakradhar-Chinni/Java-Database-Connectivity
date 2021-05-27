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
