package com.ge.predix.solsvc.service.sdo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Passenger {

	@Id
	@GeneratedValue
	private java.util.UUID id;

	private String name;

	@Column(unique=true)
	private String email;


	public java.util.UUID getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
