package com.ge.predix.solsvc.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ge.predix.solsvc.service.sdo.Address;


@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public interface AddressRepository extends PagingAndSortingRepository<Address, UUID> {
	
	List<Address> findByNameIgnoreCaseContaining(@Param("name") String name);
	List<Address> findByNameIgnoreCase(@Param("name") String name);
}
