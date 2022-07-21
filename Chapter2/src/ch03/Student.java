package ch03;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + studentName + address);
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

}
