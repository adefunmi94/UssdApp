package com.ussddemo.oldmutualussd.clientcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ussddemo.oldmutualussd.funeralussd.ClientEntity;


@RestController

public class ClientFuneralController {

	
	@Autowired
	private ClientEntity myClient;
	
	
	
	@RequestMapping(value = "/",
	        method = RequestMethod.GET)
	@ResponseBody
    public ClientEntity getMyClient(){
		
		
    
        return myClient;
	
    }
	
	 @PostMapping("/client")
	    public ClientEntity postMessage(@RequestBody ClientEntity theClient) {
			 
		 
	       return theClient;
	    }
	
}
