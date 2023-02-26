package org.generation.app.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "customer-login")
public class CustomerLogin {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)		
		@Column(name = "login_id")
		private int loginId;		
		@Column(name = "email")
		private String email;
		@Column(name = "password")
		private String password;
}
