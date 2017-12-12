package com.ge.predix.solsvc.service.sdo.internal;

import org.springframework.data.rest.core.config.Projection;

import com.ge.predix.solsvc.service.sdo.Passenger;

@Projection(name = "passengerId", types = Passenger.class)
public interface PassengerWithId {

	public java.util.UUID getId();
	
	public String getEmail();
	public String getName();

}
