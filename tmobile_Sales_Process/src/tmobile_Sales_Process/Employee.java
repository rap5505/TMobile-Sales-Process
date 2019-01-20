package tmobile_Sales_Process;

public class Employee extends Person {

	public Employee(String fullName, String address, String phoneNumber) {
		super(fullName, address, phoneNumber);
	}
	
	

	// Method that handles customer;
	
	public void handlingCustomer(CellPhone cellphone, boolean finance, Customer customer) {
		if (finance == true) {
			double loanAmount = cellphone.getPrice() - customer.getCashOnHand();
			runCredit(customer, loanAmount);
		} else if (cellphone.getPrice() <= customer.getCashOnHand()) {
			transaction(customer, cellphone);
		} else {
			System.out.println("I am very sorry, you do not have enough money to buy this cellphone. You need  " + (cellphone.getPrice() - customer.getCashOnHand()) + " more $ to buy this phone");
		}
	}
	
	
	
	// Transaction for customer; 

	public void transaction (Customer customer, CellPhone cellphone) {
		System.out.println(customer.fullName + " has decided to buy the " + cellphone.brand + cellphone.model
				+ " for " + cellphone.price + "$");
	}

	

	// Method for running customers credit;
	
	public void runCredit(Customer customer, double loanAmount) {
		System.out.println("Running your credit history");
		System.out.println("..................................");
		System.out.println(
				"It turns out to be great that you dont have money on hand because the bank is very geneours enough to land land you the credit for you new cell phone purchase");

	}

}
