package knowyourcustomer.technicaltest.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knowyourcustomer.technicaltest.entity.Account;
import knowyourcustomer.technicaltest.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Customer findCustomerByCustomerId(int customerId) {
		Session session = entityManager.unwrap(Session.class);
		Customer customer = session.get(Customer.class, customerId);
		return customer;
	}

}
