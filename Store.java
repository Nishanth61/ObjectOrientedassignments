package assignments;

import java.util.ArrayList;
import java.util.List;

public class Store {
private List<Customers> cust=new ArrayList<>();
/*names of the updated veggies
subject class
*/
private String names;
private String veg_t;
//to register for the customers for updates
public void customers(Customers cust) {
	cust.add(cust);
}


public void un_reg(Customers cust) {
	cust.remove(cust);
}
public void notification() {
	for(Customers cust : cust)
	{
		cust.update();
	}
	
}
public void upload(String veg_t) {
	System.out.println("veggies arrived");
	this.veg_t=veg_t;
	notification();

}
}
