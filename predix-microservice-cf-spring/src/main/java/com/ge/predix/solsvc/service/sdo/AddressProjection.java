package com.ge.predix.solsvc.service.sdo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "location", types = Address.class)
public interface AddressProjection {

	public String getName();
}
