package org.generation.app.repository;

import java.util.Optional;

import org.generation.app.model.CustomerLogin;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerLoginRepository extends CrudRepository<CustomerLogin, Integer> {
	Optional<CustomerLogin> findByEmail(String email);
}
