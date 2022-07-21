package ch02;

public class StudentTest {
	
public static void main(String[] args) {
		
		Student studentLee = new Student(); //인스턴스 생성 
		// 각각 다른이름으로 줄 수 있는 이유는 heap이라는 동적메모리에 할당 되기 때문이다. 
		
		//참조변수 
		studentLee.studentID = 12345;
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		
		studentLee.showStudentInfo(); // 메서드실행 
		
		Student studentKim = new Student();
		
		studentKim.studentID = 56789;
		studentKim.setStudentName("김유신");
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		//heap 메모리 할당된 주소 
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
