package org.generation.app.service;



import org.generation.app.model.CustomerLogin;

public interface ICustomerLoginService {
	
	CustomerLogin getCustomerLoginById(int id);
	
	CustomerLogin getCustomerLoginByEmail(String email);

}
