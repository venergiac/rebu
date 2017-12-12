package com.ge.predix.solsvc.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ge.predix.solsvc.service.sdo.Driver;

@RepositoryRestResource(collectionResourceRel = "drivers", path = "drivers")
public interface DriverRepository extends PagingAndSortingRepository<Driver, UUID> {

	List<Driver> findById(@Param("id")  java.util.UUID id);
	List<Driver> findByNameIgnoreCase(@Param("name") String name);
	
	 @Query("select count(*) from Driver")
	 int findNumber();
}