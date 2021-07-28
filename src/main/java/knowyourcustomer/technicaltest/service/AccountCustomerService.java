package knowyourcustomer.technicaltest.service;

import knowyourcustomer.technicaltest.entity.Account;
import knowyourcustomer.technicaltest.entity.Customer;

public interface AccountCustomerService {

	public Account findAccountByAccountNumber(int accountNumber);
	
	public void saveAccount(Account account);

	Customer findCustomerByCustomerId(int customerId);

}
