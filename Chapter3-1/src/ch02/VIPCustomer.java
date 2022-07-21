package ch02;

public class VIPCustomer extends Customer{
	
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP"; //오류나는 이유는 private 이기 때문에! 
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("vipcustomer() 호출 ");
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	
}
