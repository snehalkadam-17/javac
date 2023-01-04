//import java.sql.*; 
//public class InsertRecord {
//	public static void main(String args[])
//	{  
//		try
//		{  
//		Class.forName("com.mysql.jdbc.Driver");  
//	  
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/spark","root","");  
//		  
//		PreparedStatement stmt=con.prepareStatement("insert into student1 values(?,?,?,?)");  
//		stmt.setInt(1,101);//1 specifies the first parameter in the query  
//	     stmt.setString(2,"Ratan");  
//	     stmt.setInt(3,45);//1 specifies the first parameter in the query  
//	     stmt.setString(4,"pune"); 
//	     
//		int i=stmt.executeUpdate();  
//		
//		System.out.println(i+" records inserted");  
//		
//		con.close();  
//		 
//		}
//		catch(Exception e)
//		{ 
//			System.out.println(e);
//		}  
//	}
//}
