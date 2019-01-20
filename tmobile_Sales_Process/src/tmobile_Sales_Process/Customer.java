package tmobile_Sales_Process;

public class Customer extends Person {
	
	int cashOnHand;
	
	

	// Getting methods from the parent class (person)
	public Customer(String fullName, String address, String phoneNumber) {
		super(fullName, address, phoneNumber);
	}

	
	
	// Getters and Setters for cashOnHand;
	
	public int getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(int cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	
	
	// Customer purchase cellPhone method;
	
	
	public void purchasePhone(CellPhone cellPhone, boolean finance, Employee employee) {
		employee.handlingCustomer(cellPhone, finance, this);
	}
	

}
