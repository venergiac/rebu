package com.ge.predix.solsvc.boot;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ge.predix.solsvc.repository.AddressRepository;
import com.ge.predix.solsvc.repository.DriverRepository;
import com.ge.predix.solsvc.repository.PassengerRepository;
import com.ge.predix.solsvc.repository.TripRepository;
import com.ge.predix.solsvc.service.sdo.Address;
import com.ge.predix.solsvc.service.sdo.Driver;
import com.ge.predix.solsvc.service.sdo.Passenger;
import com.ge.predix.solsvc.service.sdo.Trip;


@Configuration
@EnableJpaRepositories(basePackageClasses = { PassengerRepository.class, TripRepository.class, DriverRepository.class,
		AddressRepository.class })
@EntityScan(basePackageClasses = { Passenger.class, Trip.class, Driver.class, Address.class })
public class RepositoryConfiguration {


}
