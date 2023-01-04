import java.sql.*;
public class updaterecord {
public static void main(String[]args)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
		PreparedStatement stmt=con.prepareStatement("update student set name=? where rollno=?");
		stmt.setString(1, "Rohit");
		stmt.setInt(2, 4);
		
		int i=stmt.executeUpdate();
		System.out.println(i+"records updated");
		
		con.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
