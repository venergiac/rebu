package com.ge.predix.solsvc.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ge.predix.solsvc.service.sdo.Passenger;

@RepositoryRestResource(collectionResourceRel = "passengers", path = "passengers")
public interface PassengerRepository extends PagingAndSortingRepository<Passenger, UUID> {

	List<Passenger> findById(@Param("id")  java.util.UUID id);
	List<Passenger> findByEmailIgnoreCase(@Param("email") String email);
}
