package ch10;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	// 디폴트값 false를 갖게된다 
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	// set 메서드에서 제어가 가능하고,데이터의 유효성 검사를 유용하게 할 수 있다. 
	public void setMonth(int month) {
		if(month <1 || month >12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if(isValid) { //true 
			System.out.println( year + "년 " + month + "월 " + day + "일 ");
		} 
		else {
			System.out.println("유효하지않은 날짜 ");
		}
	}
	
	
}
