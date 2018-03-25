package dbfactory;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbImpl implements DbIntr
{
	
	private static Connection con;

	static{
		
		   
			
			try
			{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","oracle");
				
			}
			catch(SQLException | ClassNotFoundException e)
			{
				e.printStackTrace();
				
			}
		
		
		
		
	}
		   
		   
		   
		   public Student getStudentData(String usn) throws SQLException{
			   
			   Statement stmt=con.createStatement();
			   String query="select * from ATTENDANCE_UPDATE2 where USN ='"+usn.toUpperCase()+"'";
			   //String query="select * from ATTENDANCE_UPDATE2 where USN ='"+usn.toUpperCase()+"'" &&  ='"subCode.toUpperCase()+"'";
			   System.out.println(query);
			   ResultSet rs=stmt.executeQuery(query);
			   Student s=new Student();
			   while(rs.next()){
				   System.out.println(rs.getString("FACULTY_ID"));
				   s.setUsn(usn);
				   s.setFacultyId(rs.getString("FACULTY_ID"));
				   s.setSemester(rs.getString("SEMESTER"));
				   s.setSubCode(rs.getString("SUB_CODE"));
				   s.setClassTaken(rs.getString("NO_OF_CLASSES_TAKEN"));
				   s.setClassPresent(rs.getString("NO_OF_CLASSES_PRESENT"));
				   
				   
			   }
			   
			   return s;
		   }
		   public int insertAttendance_update2(String usn,String facultyId,String semester,String subCode,String classTaken,String classPresent)throws SQLException
		   {
			   int rowAfftected=0;
			   try(PreparedStatement stmt=con.prepareStatement("insert into Attendance_update2(USN,Faculty_id,Semester,Sub_code,No_Of_classes_taken,No_of_classes_present) values(?,?,?,?,?,?)");)
			   {
				   stmt.setString(1,usn);
					stmt.setString(2,facultyId);
					stmt.setString(3, semester);
					stmt.setString(4,subCode);
					stmt.setString(5,classTaken);
					stmt.setString(6,classPresent);

					rowAfftected=stmt.executeUpdate();
			   }
			   catch(SQLException e)
			   {
				   try {
					throw e;
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			   }
			   return rowAfftected;
		   }
		   
		   
		  /* public int insertStudent_info(String usn,String name,String sem,String dno)throws SQLException
		   {
			   int rowAffected=0;
			   try(PreparedStatement stmt=con.prepareStatement("insert into Student1(USN,name,Semester,Dep_id)values(?,?,?,?)");)
			   {
				    stmt.setString(1,usn);
					stmt.setString(2,name);
					stmt.setString(3,sem);
					stmt.setString(4,dno); 
			   }
			   catch(SQLException e)
			   {
				  e.printStackTrace(); 
			   }
			   return rowAffected;
		   }*/
		   public int deleteAttendance_update2(String usn)throws SQLException
		   {
			   int rowAffected=0;
			   try(PreparedStatement stmt=con.prepareStatement("delete from Attendance_update2 where USN=?");)
			   {
				    stmt.setString(1,usn);
				return rowAffected=stmt.executeUpdate();
			   }
			   catch(SQLException e)
			   {
				  e.printStackTrace();  
			   }
			   return rowAffected;
		   }
		   public int updateAttendance_update2(String sem,String usn)throws SQLException
		   {
			   int rowAffected=0;
			   System.out.println(sem);
			// try(PreparedStatement stmt=con.prepareStatement("update Attendance_update2 set Semester=? where USN=?");)
			  try(CallableStatement cs = con.prepareCall("call proceed_update(?,?)");)
			   {
				    //stmt.setString(1,sem);
				    //stmt.setString(2,usn);
				 cs.setString(1,sem);
				 cs.setString(2,usn);
				   // return rowAffected=stmt.executeUpdate();
				 return rowAffected=cs.executeUpdate();
			   }
			   catch(SQLException e)
			   {
				  e.printStackTrace(); 
			   }
			   return rowAffected;
		   }
}

