package com.ussddemo.oldmutualussd.funeralussd;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
// @PropertySource(value = "classpath:funeralconfig.json",
//factory = JsonPropertySourceFactory.class)
@Component
@ConfigurationProperties
public class ClientEntity {

	private String username;
	private String password;
	private String requests;
	
	
	public ClientEntity() {
		super();
	}
	

	public ClientEntity(String username, String password, String requests) {
		super();
		this.username = username;
		this.password = password;
		this.requests = requests;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRequests() {
		return requests;
	}


	public void setRequests(String requests) {
		this.requests = requests;
	}


	@Override
	public String toString() {
		return "ClientEntity [username=" + username + ", password=" + password + ", requests=" + requests + "]";
	}
	
	
	
	
}
