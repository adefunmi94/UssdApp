package com.ussddemo.oldmutualussd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ussddemo.oldmutualussd.funeralussd.ClientEntity;

@SpringBootApplication
@ComponentScan(basePackageClasses = { ClientEntity.class})
public class UssdappApplication {
	public static void main(String[] args) {
		SpringApplication.run(UssdappApplication.class, args);
	}

}
