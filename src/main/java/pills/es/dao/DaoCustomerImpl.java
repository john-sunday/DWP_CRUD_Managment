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

// Con '@Repository' Spring reconoce esta clase como un bean.
@Repository
public class DaoCustomerImpl implements DaoCustomer{

	@Override
	// Con la anotación @Transactional nos ahorramos 'begin,commit....' de la transacción.
	@Transactional
	public List<Customer> getCustomers() {
		/*			SessionFactory myFactory = 
					new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Customer.class)
					.addAnnotatedClass(CustomerDetails.class)//--> Faltaba añadir la otra clase anotada.
					.addAnnotatedClass(CustomerOrder.class)
					.buildSessionFactory();
			Session mySession = myFactory.openSession();
			
			try {
				//Customer customer = new Customer("Pepe","Ortin","Av.Republica");
				//Customer customer = new Customer("Concha","Revo","Calle Vallecas");
				//Customer customer = new Customer("Johnny","Good","Calle Florencia");
				//Customer customer = new Customer("Alejandra","Matamoros","Av Albufera");
				Customer customer = new Customer("Maria","de la O","Calle Pasodoble");
				//customer.setCustomerDetails(new CustomerDetails("www.jose.r3p","987654321","Great Heart, Gold Heart"));
				//customer.setCustomerDetails(new CustomerDetails("www.concha.r3p","333333333","Our best customer"));
				customer.setCustomerDetails(new CustomerDetails("www.mary.r3p","123456789","She is our most valorated customer"));
				//customer.setCustomerDetails(new CustomerDetails("www.alex.r3p","2222222","comments"));
				//customer.setCustomerDetails(new CustomerDetails("www.johnny.r3p","999999999","comments"));
				
				mySession.beginTransaction();
				mySession.save(customer);			
				mySession.getTransaction().commit();
				System.out.println("Customer and Customer Details Sucessfully INSERTED in DB");				
				/*
				 * mySession.beginTransaction(); mySession.save(customer2);
				 * mySession.getTransaction().commit();
				 * System.out.println("Record Sucessfully INSERT in DB");
				 */							
			/*}catch(Exception e){
				e.printStackTrace();
			}finally {
				mySession.close();
				myFactory.close();
			}*/
		// Get the session.
		Session mySession = sessionFactory.getCurrentSession();
		// Create query.
		Query<Customer> myQuery = mySession.createQuery("FROM Customer", Customer.class);
		// Execute query and get back response.		  
		List<Customer> customers = myQuery.getResultList();
		 	
		return customers;
	}
	
	// Se tiene que llamar igual que en el archivo 'spring-crud-servlet.xml'.
	@Autowired	
	private SessionFactory sessionFactory;
}
