package com.ge.predix.solsvc.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * An example of creating a Rest api using Spring Annotations @RestController.
 * 
 * 
 * 
 * @author predix
 */

@RestController
@RequestMapping("rebu")
public class HelloController
{

    /**
     * 
     */
    public HelloController()
    {
        super();
    }
    
    /**
     * @return -
     */
    @SuppressWarnings("nls")
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health()
    {
        return String.format("{\"status\":\"up\", \"date\": \" " + new Date() + "\"}");
    }

}
