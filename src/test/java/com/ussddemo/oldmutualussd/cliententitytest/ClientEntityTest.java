package com.ussddemo.oldmutualussd.cliententitytest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.ussddemo.oldmutualussd.funeralussd.ClientEntity;

@SpringBootTest
public class ClientEntityTest {

	private Logger logger = Logger.getLogger(getClass().getName());
	
	
	@Autowired
	private ClientEntity myClient;
	
	      

	
	@Test
    public void validateParametersTest() {
		
		try {
			assertNotNull(myClient);
			
			
        assertEquals("Lovelybasy", myClient.getUsername());
        assertEquals("Bintu404",  myClient.getPassword());
        assertEquals("SHC2403", myClient.getRequests());
        
        
        
		}
		catch(Exception exe) {
			exe.printStackTrace();
		}
		
		
		logger.info("it working");
    }


}
