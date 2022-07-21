package ch04;

public class OrderTest {
	public static void main(String[] args) {
		Order orderT = new Order();
		orderT.orderNo = "202011020003";
		orderT.hp = "01023450001";
		orderT.addr = "서울시 강남구 역삼동 111-333";
		orderT.orderDate = "20201102";
		orderT.orderTime = "130258";
		orderT.orderBill = "35000";
		orderT.menuNo = "35000";
		
		orderT.showinfo();
		
	}
	
	
	

}
