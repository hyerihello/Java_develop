package ch02;

public class Student {
	
	//멤버변수 생성 
	public int studentID;
	public String studentName;  
	public String address;
	
	// 메서드 생성 
	public void showStudentInfo() {
		System.out.println(studentID + "," + studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
		
	}

}
