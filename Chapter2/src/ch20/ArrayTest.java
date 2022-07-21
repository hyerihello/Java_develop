package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		
		int [] arr = new int[10];
		int total1 = 0;
		int total2 = 0;
		
		System.out.println(arr.length);
		for (int i=0, num=1; i<arr.length; i++) {
			arr[i] = num++;
		}
		for (int i=0; i<arr.length; i++) {
			total1 += arr[i];
			
		}
		System.out.println(total1);
		
		for (int num : arr) {
			total2 += num;
			
		}
		System.out.println(total2);
	}

}
