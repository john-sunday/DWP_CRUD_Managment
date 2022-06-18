package pills.es.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import pills.es.bean.entity.Customer;

// Con '@Repository' Spring reconoce esta clase como un bean, como un repositorio.
@Repository
public class DaoCustomerImpl implements DaoCustomer{

	// Se tiene que llamar igual que en el archivo 'spring-crud-servlet.xml'.
	@Autowired	
	private SessionFactory sessionFactory;
	
	@Override
	// Con la anotación @Transactional nos ahorramos 'begin,commit....' de la transacción.
	@Transactional
	public List<Customer> getCustomers() {
		// Get the session.
		Session mySession = sessionFactory.getCurrentSession();
		// Create query.
		Query<Customer> myQuery = mySession.createQuery("FROM Customer", Customer.class);
		// Execute query and get back response.		  
		List<Customer> customers = myQuery.getResultList();
		 	
		return customers;
	}

	@Override
	@Transactional
	public void insertCustomer(Customer customer) {
		Session mySession = sessionFactory.getCurrentSession();
		mySession.save(customer);
	}
}
