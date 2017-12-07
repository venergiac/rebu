package com.ge.predix.solsvc.service.sdo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Address {

	
	@Id
	@GeneratedValue
	private java.util.UUID id;

	@Column(unique=true)
	private String name;
	private String lat;
	private String lon;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public java.util.UUID getId() {
		return id;
	}
	
	
	
}
