package dbfactory;

import java.sql.SQLException;

public interface DbIntr
{
	public Student getStudentData(String usn) throws SQLException;
	 public int insertAttendance_update2(String usn,String facultyId,String semester,String subCode,String classTaken,String classPresent)throws SQLException;
	//public int insertStudent_info(String usn,String name,String sem,String dno)throws SQLException;
	 public int deleteAttendance_update2(String usn)throws SQLException;
	 public int updateAttendance_update2(String sem,String usn)throws SQLException;
}
