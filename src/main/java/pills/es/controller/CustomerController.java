package pills.es.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pills.es.bean.entity.Customer;
import pills.es.dao.DaoCustomer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// Dependency Injection -> 'DaoCustomer' injected in 'CustomerController'
	@Autowired
	private DaoCustomer daoCustomer;
	
	@RequestMapping("/customerList")
	public String customerList(Model model) {
		// To get the customers from DAO.
		List<Customer> customers = daoCustomer.getCustomers();
		// Agregate the customer to model.
		model.addAttribute("customers",customers);
		
		return "customer_list";
	}
}
