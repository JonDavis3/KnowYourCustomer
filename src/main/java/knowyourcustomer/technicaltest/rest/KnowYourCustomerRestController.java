package knowyourcustomer.technicaltest.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import knowyourcustomer.technicaltest.entity.Account;
import knowyourcustomer.technicaltest.entity.Customer;
import knowyourcustomer.technicaltest.service.AccountCustomerService;

@RestController
@RequestMapping("/api")
public class KnowYourCustomerRestController {
	
	@Autowired
	private AccountCustomerService accountCustomerService;
	
	@GetMapping("/customers/{accountNumber}")
	public List<Customer> getCustomersForAccountNumber(@PathVariable int accountNumber) {
		Account account = accountCustomerService.findAccountByAccountNumber(accountNumber);
		
		if(account == null) {
			throw new NotFoundException("No account found with account number: " + accountNumber);
		}
		
		return account.getCustomers();
	}
	
	@GetMapping("/accounts/{customerId}")
	public List<Account> getAccountsForCustomerId(@PathVariable int customerId) {
		Customer customer = accountCustomerService.findCustomerByCustomerId(customerId);
		
		if(customer == null) {
			throw new NotFoundException("No customer found with customer id: " + customerId);
		}
		
		return customer.getAccounts();
	}
	
	@PostMapping("/accounts")
	public Account addAccount(@RequestBody Account account) {
		accountCustomerService.saveAccount(account);
		return account;
	}
	
}
