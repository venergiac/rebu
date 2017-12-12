package com.ge.predix.solsvc.repository.internal;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.repository.AddressRepository;
import com.ge.predix.solsvc.repository.TripRepository;
import com.ge.predix.solsvc.service.sdo.Address;
import com.ge.predix.solsvc.service.sdo.Trip;

@Component
@RepositoryEventHandler
public class TripHandler {

	@Autowired
	AddressRepository addressRepository;
	@Autowired
	TripRepository tripRepository;

	@HandleBeforeCreate(Trip.class)
	public void handleTripSave(Trip trip) {
		
		if (trip.getTimestamp()==null) {
			trip.setTimestamp(new Date());
		}
		
		if (trip.getTo() != null) {
			trip.setToName(trip.getTo().getName());
		} else if (trip.getToName() != null) {
			List<Address> addresses = addressRepository.findByNameIgnoreCase(trip.getToName());
			if (addresses != null && !addresses.isEmpty()) {
				trip.setTo(addresses.get(0));
				System.out.println("new to + " + trip.getTo());
			}

		} else {
			System.out.println("Anomaly trip " + trip);
		}
	}

}
