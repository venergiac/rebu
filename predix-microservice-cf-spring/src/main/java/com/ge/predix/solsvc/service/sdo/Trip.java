package com.ge.predix.solsvc.service.sdo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Trip {

	@Id
	@GeneratedValue
	private java.util.UUID id;

	private String status;

	private int stuff;

	@LastModifiedDate
	private Date timestamp;

	@OneToOne
	private Address from;

	@OneToOne
	private Address to;

	private String whenmin;

	@OneToOne
	private Passenger passenger;

	@OneToOne
	private Driver driver;
	
	private String notes;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStuff() {
		return stuff;
	}

	public void setStuff(int stuff) {
		this.stuff = stuff;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getWhenmin() {
		return whenmin;
	}

	public void setWhenmin(String whenmin) {
		this.whenmin = whenmin;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public java.util.UUID getId() {
		return id;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Address getFrom() {
		return from;
	}

	public void setFrom(Address from) {
		this.from = from;
	}

	public Address getTo() {
		return to;
	}

	public void setTo(Address to) {
		this.to = to;
	}
	
	

}
