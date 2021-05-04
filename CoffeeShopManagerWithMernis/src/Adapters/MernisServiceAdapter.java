package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap mernisService = new KPSPublicSoapProxy();
		boolean result = false;
		try {
		result=	mernisService.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
					customer.lastName.toUpperCase(),customer.getBirth().getYear() );
		}catch(Exception e) {
			System.out.println("Not a valid person!");
		}
		return result;
	}

}
