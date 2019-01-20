package tmobile_Sales_Process;


public class SalesProject {

	public static void main(String[] args) {
		
		
		// Customer 1 purchasing phone
		
		
		Customer customer1 = new Customer("Romit Patel", "101 main street", "5701282812");
		customer1.setCashOnHand(800);
		
		
		CellPhone cellPhone1 = new CellPhone("Samsung", "s8", 700);
		
		Employee employee1 = new Employee("Jessica", "123 main ave", "1123512531");
		
		customer1.purchasePhone(cellPhone1, false, employee1);
		
		
		
		// Customer 2 purchasing phone
		
		
		Customer customer2 = new Customer("John Snow", "124 north LN", "1421255123");
		customer2.setCashOnHand(500);
		
		CellPhone cellPhone2 = new CellPhone("Apple", "sX-Max", 1000);
		
		Employee employee2 = new Employee("Jessica", "123", "1246237341");
		
		customer2.purchasePhone(cellPhone2, false, employee2);
		
		
		
	
		// Comparing if it returns true for the same CellPhone;
		// It should be true because of overriding the equals method in CellPhone class.
		CellPhone phone1 = new CellPhone("Apple", "sX-Max", 1000);
		CellPhone phone2 = new CellPhone("Apple", "sX-Max", 1000);
		
		boolean value = phone1.equals(phone2);
		System.out.println(value);

	}

}
