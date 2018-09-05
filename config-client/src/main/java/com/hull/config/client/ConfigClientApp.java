package com.hull.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hull.config.client.conf.Config;


@SpringBootApplication
@RestController
public class ConfigClientApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigClientApp.class, args);
    }
    
   
    @Autowired
    Config config;    
    
    @RequestMapping(value="/mail")
    public String getMail() {
    	return config.getMail();
    }
    
    @RequestMapping(value="/user")
    public String getUser() {
    	return config.getName();
    }
}
