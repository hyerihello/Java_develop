package ch04;

public class VIPCustomer extends Customer{
	
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP"; //오류나는 이유는 private 이기 때문에! 
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}
