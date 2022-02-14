package com.codestates.seb.spring_airline_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringAirlineServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAirlineServerApplication.class, args);
	}

}
