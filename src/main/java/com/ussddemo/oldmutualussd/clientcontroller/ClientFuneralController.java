package com.ussddemo.oldmutualussd.clientcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ussddemo.oldmutualussd.funeralussd.ClientEntity;


@RestController
@RequestMapping
public class ClientFuneralController {

	
	@Autowired
	private ClientEntity myClient;
	
	
	
	@GetMapping(path="/")
    public ClientEntity getMyClient(){
		
		
    
        return myClient;
	
    }
	
	
	
}
