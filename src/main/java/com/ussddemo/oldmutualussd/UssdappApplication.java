package com.ussddemo.oldmutualussd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses = { ClientEntity.class})
public class UssdappApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(UssdappApplication.class, args);
    
//		SpringApplication.run(UssdappApplication.class, args);
	}

}
