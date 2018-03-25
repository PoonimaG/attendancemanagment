package dbfactory;

public class Student
{

	private String usn;
	private String facultyId;
	private String semester;
	private String subCode;
	private String classTaken;
	private String classPresent;
	
	
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	/*public String getSemester() {
		return semester;
    }
	public void setSemester(String semester) {
		this.semester = semester;
	}*/
		
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getClassTaken() {
		return classTaken;
	}
	public void setClassTaken(String classTaken) {
		this.classTaken = classTaken;
	}
	public String getClassPresent() {
		return classPresent;
	}
	public void setClassPresent(String classPresent) {
		this.classPresent = classPresent;
	}
	public String getSemester() {
		// TODO Auto-generated method stub
		return semester;
	}
	public void setSemester(String semester) {
		// TODO Auto-generated method stub
		this.semester = semester;
	}
	
	
}
