package com.ussddemo.oldmutualussd.cliententitytest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.ussddemo.oldmutualussd.UssdappApplication;
import com.ussddemo.oldmutualussd.funeralussd.ClientEntity;

@SpringBootTest
@ContextConfiguration(
  classes = UssdappApplication.class)
public class ClientEntityTest {

	
	@Autowired
	private ClientEntity myClient;
	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
    public void validateParametersTest() {
		
		try {
        assertEquals("Lovelybasy", myClient.getUsername());
        assertEquals("Bintu404",  myClient.getPassword());
        assertEquals("SHC2403", myClient.getRequests());
		}
		catch(Exception exe) {
			exe.printStackTrace();
		}
    }


}
