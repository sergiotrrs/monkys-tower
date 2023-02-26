package org.generation.app.service;

import org.generation.app.model.CustomerLogin;
import org.generation.app.repository.ICustomerLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CutomerLoginService implements ICustomerLoginService{

	@Autowired
	ICustomerLoginRepository customerLoginRepository;
	
	@Override
	public CustomerLogin getCustomerLoginById(int id) {		
		return customerLoginRepository.findById(id).orElseThrow(null);
	}

	@Override
	public CustomerLogin getCustomerLoginByEmail(String email) { 
		return customerLoginRepository.findByEmail(email).orElseThrow(null);
	}

}
