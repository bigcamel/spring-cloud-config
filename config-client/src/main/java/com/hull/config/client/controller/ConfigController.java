package com.hull.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hull.config.client.conf.Config;


@RestController
@RefreshScope
public class ConfigController {
	
	@Autowired
	Config config;

	@RequestMapping(value="/age")
	public String getAge() {
		return config.getAge();
	}
}
