package org.generation.app.controller;

import java.util.List;

import org.generation.app.model.Customer;
import org.generation.app.service.ICustomerService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (path="/api/customer")
@CrossOrigin(origins="*")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	@PostMapping
	public String saveCustomer(@RequestBody Customer customer) {
		return customerService.setCustomer(customer);
	}
	
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}
	
	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

}
