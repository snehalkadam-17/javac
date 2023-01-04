import java.sql.*;

import java.lang.*;
public class SelectRecord1
{
	public static void main(String[] args) 
	{

		try
		{  
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");  
			//here sono is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student");  
			while(rs.next()) 
			{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4));  
			}
			con.close();
		}catch(Exception e)
		{
			
		}
	}
}

