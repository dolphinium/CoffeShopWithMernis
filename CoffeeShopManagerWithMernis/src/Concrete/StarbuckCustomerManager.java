package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {
 
	private ICustomerCheckService customerCheckService;
	
	public StarbuckCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else 
			System.out.println("Not a valid person!");
		
	}
}
