package com.ge.predix.solsvc.service.sdo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Driver {

	
	@Id
	@GeneratedValue
	private java.util.UUID id;

	@Column(unique=true)
	private String name;

	private int stuff;
	
	private String plate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuff() {
		return stuff;
	}

	public void setStuff(int stuff) {
		this.stuff = stuff;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public java.util.UUID getId() {
		return id;
	}
	
	
	
}
