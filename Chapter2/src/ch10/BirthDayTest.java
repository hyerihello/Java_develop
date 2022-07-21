package ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		
		
		date.setYear(2019);
		date.setMonth(13);
		date.setDay(30);
		
		date.showDate();
		
		 BirthDay date2 = new BirthDay();
			
			
		date2.setYear(2019);
		date2.setMonth(12);
		date2.setDay(30);
		
		date2.showDate();
	}

}
