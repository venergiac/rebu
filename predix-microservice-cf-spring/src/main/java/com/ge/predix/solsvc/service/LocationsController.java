package com.ge.predix.solsvc.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/l")
public class LocationsController {

	
	private List<String> locations = Arrays.asList(new String[]{"Firenze SMN", "Firenze AirPort", "Firenze New Pignone International"});
	
	/**
     * @return -
     */
    @SuppressWarnings("nls")
    @RequestMapping(value = "/locations", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<String> locations(@RequestParam("name") String name)
    {
    	
    	List<String> out = locations.stream().filter(t -> t.toLowerCase().indexOf(name.toLowerCase())>=0).collect(Collectors.toList());
    	System.out.println(out);
    	return out;
    }
	
}
