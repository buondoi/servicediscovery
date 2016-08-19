package com.apps.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;


/**
 * Created on 8/19/16.
 */
@RestController
@SpringBootApplication
@EnableEurekaServer
public class Application
{
	@RequestMapping(value = "/status")
	public Map<String, Boolean> healthCheck()
	{
		return Collections.singletonMap("status", Boolean.TRUE);
	}

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}
}
