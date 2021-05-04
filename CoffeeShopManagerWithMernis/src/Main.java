import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String []args) {
		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"yunus","korkmaz",LocalDate.of(1999,11,27),"1234567891"));
		
		
	}

}
