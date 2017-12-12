package com.ge.predix.solsvc.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.predix.solsvc.repository.AddressRepository;
import com.ge.predix.solsvc.repository.TripRepository;
import com.ge.predix.solsvc.service.sdo.Address;

@RestController
@RequestMapping("rebu/v2")
public class RebuController {

	@Autowired AddressRepository addressRepository;
	@Autowired TripRepository tripRepository;
	
	/**
     * @return -
     */
    @SuppressWarnings("nls")
    @RequestMapping(value = "/locations", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<String> locations(@RequestParam("name") String name)
    {
    	List<Address> addresses = addressRepository.findByNameIgnoreCaseContaining(name);
    	System.out.println(addresses);
    	List<String> out = addresses.stream()
    			.map( t -> t.getName())
    			.collect(Collectors.toList());
    	System.out.println(out);
    	return out;
    }
    
	
}
