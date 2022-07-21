package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		//System.out.println(employeeLee.serialNum);
		
		System.out.println(employeeLee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
//		//결과가 같은이유는 두개의 인스턴스가 하나의 메모리를 공유한다 
//		System.out.println(employeeLee.serialNum);
//		System.out.println(employeeKim.serialNum);
		
		
		System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());
	}

}
