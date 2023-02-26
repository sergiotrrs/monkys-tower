package org.generation.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "customer_id")
	private int customerId;
	@Column( name = "first_name")
	private String firstName;
	@Column( name = "last_name")
	private String lastName;
	@Column( name = "is_active")
	private boolean isActive;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn( name ="fk_login_id", referencedColumnName = "login_id")
	private CustomerLogin loginId;
	
}
