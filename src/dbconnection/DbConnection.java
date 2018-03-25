package dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection
{
	public static void main(String args[])
	{

       Connection connection=null;
       {
		
		try
		{
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","oracle");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		if(connection!=null)
		{
			System.out.println("Connection successfull");
		}
		else
		{
			System.out.println("Connection Failled");
		}
	
}
	}                        }
