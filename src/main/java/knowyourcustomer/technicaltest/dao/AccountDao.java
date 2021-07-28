package knowyourcustomer.technicaltest.dao;

import knowyourcustomer.technicaltest.entity.Account;

public interface AccountDao {
	
	public Account findAccountByAccountNumber(int accountNumber);
	
	public void saveAccount(Account account);

}
