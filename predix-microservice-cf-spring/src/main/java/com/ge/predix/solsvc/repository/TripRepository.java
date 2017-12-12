package com.ge.predix.solsvc.repository;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ge.predix.solsvc.service.sdo.Driver;
import com.ge.predix.solsvc.service.sdo.Passenger;
import com.ge.predix.solsvc.service.sdo.Trip;

@RepositoryRestResource(collectionResourceRel = "trips", path = "trips")
public interface TripRepository extends PagingAndSortingRepository<Trip, UUID> {

	List<Trip> findByStatus(@Param("status") String status);

	List<Trip> findByStatusAndPassenger(@Param("status") String status, @Param("passenger") Passenger passenger);

	List<Trip> findByDriver(@Param("driver") Driver driver);

	List<Trip> findByPassenger(@Param("passenger") Passenger passenger);

	List<Trip> findByStatusNotInAndPassenger(@Param("statuses") Collection<String> statuses,
			@Param("passenger") Passenger passenger);
	
	List<Trip> findByStatusInAndDriver(@Param("statuses") Collection<String> statuses,
			@Param("driver") Driver passenger);
	
	List<Trip> findByStatusNotIn(@Param("statuses") Collection<String> statuses);
	
	List<Trip> findByStatusIn(@Param("statuses") Collection<String> statuses);
	

	
}