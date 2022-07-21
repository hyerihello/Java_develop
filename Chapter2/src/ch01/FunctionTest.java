package ch01;

public class FunctionTest {
	
	// 1. 매개변수가 있고 반환값이 있는경우 
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	// 2. 반환값이 없는경우 
	public static void sayHello(String greeting) { //return 값 없을때 void 
		System.out.println(greeting);
	}
	// 3. 매개변수가 없 반환값이 있는경우 
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		sayHello("안녕하세요");
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
	}


}
