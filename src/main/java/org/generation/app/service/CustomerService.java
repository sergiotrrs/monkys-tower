package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Customer;
import org.generation.app.model.CustomerLogin;
import org.generation.app.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	ICustomerRepository customerRepository;
	
	@Override
	public String setCustomer(Customer customer) {
		customerRepository.save(customer);		
		return "Customer saved";
	}

	@Override
	public Customer getCustomerById(int id) {		 
		return customerRepository.findById(id).orElseThrow(null);
	}

	@Override
	public Customer getCustomerByLogin(CustomerLogin customerLogin) { 
		//return customerRepository.findByCustomerLogin(customerLogin).orElseThrow(null);
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {		
		return (List<Customer>) customerRepository.findAll();
	}

}
