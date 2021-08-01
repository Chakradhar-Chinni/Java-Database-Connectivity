import java.sql.*;
public class RegisterDao {
	private String dbUrl = "jdbc:mysql://localhost:3309/javaep";
	private String dbUname = "root";
	private String dbPassword = "admin";
	private String dbDriver = "com.mysql.jdbc.Driver"; 
	
	public void loadDriver(String dbDriver)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException
	{
		Connection con = null;
		con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);
		
		return con;
	}
	
	
	public String insert(Member member)  
	{
		loadDriver(dbDriver);
		Connection con = null;
		try {
			con = getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		String query = "INSERT INTO member values(?,?,?,?)";
		String result = "Data is Entered";
		PreparedStatement st;
		try {
			st = con.prepareStatement(query);         
			st.setString(1,member.getUname());
			st.setString(2,member.getPassword());
			st.setString(3,member.getEmail());
			st.setString(4,member.getPhone());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result =  "Data is not Entered";
		}
		
		return result;
	}
	
}
