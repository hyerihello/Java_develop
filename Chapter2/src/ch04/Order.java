package ch04;

public class Order {
	public String orderNo;
	public String hp;
	public String addr;
	public String orderDate;
	public String orderTime;
	public String orderBill;
	public String menuNo;
	
	
	public void showinfo() {
		System.out.println("주문 접수 번호 : " + orderNo +
				"\n주문 핸드폰 번호 : " + hp +
				"\n주문 집 주소 : " + addr + 
				"\n주문 날짜 : " + orderDate + 
				"\n주문 시간 : " + orderTime + 
				"\n주문 가격 : " + orderBill +
				"\n메뉴 번호 : " +  menuNo );
	}
}
