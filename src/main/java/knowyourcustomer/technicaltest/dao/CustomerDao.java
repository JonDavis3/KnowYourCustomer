package knowyourcustomer.technicaltest.dao;

import knowyourcustomer.technicaltest.entity.Customer;

public interface CustomerDao {
	
	public Customer findCustomerByCustomerId(int accountNumber);

}
