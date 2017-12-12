package com.ge.predix.solsvc.service.sdo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.LastModifiedDate;

@Entity
public class Trip {

	@Id
	@GeneratedValue
	private java.util.UUID id;

	@NotNull
	private String status;

	@Column(columnDefinition="tinyint(1) default 1")
	private int stuff;

	@LastModifiedDate
	private Date timestamp;

	@NotNull
	private String fromLat;
	
	@NotNull
	private String fromLon;

	@OneToOne
	@NotNull
	private Address to;
	
	private String toName;

	private String whenmin;

	@OneToOne
	@NotNull
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


	public String getFromLat() {
		return fromLat;
	}

	public void setFromLat(String fromLat) {
		this.fromLat = fromLat;
	}

	public String getFromLon() {
		return fromLon;
	}

	public void setFromLon(String fromLon) {
		this.fromLon = fromLon;
	}

	public Address getTo() {
		return to;
	}

	public void setTo(Address to) {
		this.to = to;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	@Override
	public String toString() {
		return "Trip [id=" + id + ", status=" + status + ", stuff=" + stuff + ", timestamp=" + timestamp + ", fromLat="
				+ fromLat + ", fromLon=" + fromLon + ", to=" + to + ", toName=" + toName + ", whenmin=" + whenmin
				+ ", passenger=" + passenger + ", driver=" + driver + ", notes=" + notes + "]";
	}

	
	

}
