package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Customer;
import org.generation.app.model.CustomerLogin;

public interface ICustomerService {
	
	String setCustomer(Customer customer);
	
	Customer getCustomerById(int id);
	
	Customer getCustomerByLogin(CustomerLogin customerLogin);
	
	List<Customer> getAllCustomers();
}
