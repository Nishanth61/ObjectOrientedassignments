package assignments;

public class MainStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store nish=new Store();
		/*
		 * Here we are adding the customers
		 * */
		Customers c1= new Customers("Nishanth");
		Customers c2= new Customers("Laffi");
		Customers c3= new Customers("Rajitha");
		Customers c4= new Customers("Ram");
		Customers c5= new Customers("Ranjith");
		/*
		 * Here we are adding the customers to the
		 * wait list so that they can know when the new 
		 * stock arrives in the stores
		 * */
		nish.customers(c1);
		nish.customers(c2);
		nish.customers(c3);
		nish.customers(c4);
		nish.customers(c5);
		/*
		 * Here we are telling him the store name*/
		c1.storeLocation(nish);
		/*
		 * Here we are letting the customer know that the fresh
		 * vegetables arrived
		 * */
		nish.upload("Fresh vegetables arrived");
	}

}
