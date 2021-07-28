package knowyourcustomer.technicaltest.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import knowyourcustomer.technicaltest.entity.Account;
import knowyourcustomer.technicaltest.entity.Customer;

@Repository
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Account findAccountByAccountNumber(int accountNumber) {
		Session session = entityManager.unwrap(Session.class);
		Query<Account> query = session.createQuery("from Account where accountNumber =:acctNumber", Account.class)
	            .setParameter("acctNumber", accountNumber);
		return query.uniqueResult();
	}

	@Override
	public void saveAccount(Account account) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(account);
	}

}
