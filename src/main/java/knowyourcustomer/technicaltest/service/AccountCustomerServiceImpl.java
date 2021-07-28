package knowyourcustomer.technicaltest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import knowyourcustomer.technicaltest.dao.AccountDao;
import knowyourcustomer.technicaltest.dao.CustomerDao;
import knowyourcustomer.technicaltest.entity.Account;
import knowyourcustomer.technicaltest.entity.Customer;

@Service
public class AccountCustomerServiceImpl implements AccountCustomerService {
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	@Transactional
	public Account findAccountByAccountNumber(int accountNumber) {
		return accountDao.findAccountByAccountNumber(accountNumber);
	}
	
	@Override
	@Transactional
	public Customer findCustomerByCustomerId(int customerId) {
		return customerDao.findCustomerByCustomerId(customerId);
	}

	@Override
	@Transactional
	public void saveAccount(Account account) {
		accountDao.saveAccount(account);
		
		
	}

}
