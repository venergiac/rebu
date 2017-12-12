package com.ge.predix.solsvc.service.sdo.internal;

import org.springframework.data.rest.core.config.Projection;

import com.ge.predix.solsvc.service.sdo.Driver;

@Projection(name = "driverId", types = Driver.class)
public interface DriverWithId {
	public java.util.UUID getId();
	public String getName();
}
