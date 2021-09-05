package assignments;

public class Customers {
	/* observer class
	 * Properties of customers are
	 * */
	private String cust_name;
	private Store store= new Store();
	
	public Customers(String cust_name) {
		super();
		this.cust_name = cust_name;
	}

	public void update() {
		System.out.println("Fresh vegetables arrived");
	}

	public void remove(Customers cust) {
		// TODO Auto-generated method stub
		
	}

	public void add(Customers cust) {
		// TODO Auto-generated method stub
		
	}
	public void storeLocation(Store s) {
		store = s;
	}
}
