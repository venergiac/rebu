package com.ge.predix.solsvc.service.sdo.internal;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.ge.predix.solsvc.service.sdo.Address;
import com.ge.predix.solsvc.service.sdo.Driver;
import com.ge.predix.solsvc.service.sdo.Passenger;
import com.ge.predix.solsvc.service.sdo.Trip;


@Projection(name = "tripcompact", types = Trip.class)
public interface TripInlineAddress {
	public String getStatus();

	public int getStuff();

	public Date getTimestamp();

	public String getWhenmin();

	public Passenger getPassenger();

	public Driver getDriver();

	public java.util.UUID getId();

	public String getNotes();
	
	public Address getTo();
	
	public String getToName();
	
	public String getFromLon();
	
	public String getFromLat();
	
	@Value("#{target.passenger!=null ? target.passenger.name : null}") 
	public String getPassengerName();
	
	@Value("#{target.driver!=null ? target.driver.name : null}") 
	public String getDriverName();
	
	@Value("#{target.driver!=null ? target.driver.name : null}") 
	public String getLinkFrom();
}