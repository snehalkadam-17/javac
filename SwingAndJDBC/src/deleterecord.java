import java.sql.*;
public class deleterecord {
public static void main(String[]args)
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
	Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");
PreparedStatement stmt=con.prepareStatement("delete from student where rollno=?");
stmt.setInt(1, 2);
int i=stmt.executeUpdate();
System.out.println(i+"records deleted");
con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
