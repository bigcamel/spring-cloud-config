package com.hull.config.client.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class Config {
	
	@Value("${user.mail}")
	private String mail;
	
	@Value("${user.age}")
	private String age;
	
	@Value("${user.name}")
	private String name;
	
	public String getMail() {
		return this.mail;
	}
	
	public String getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
}
