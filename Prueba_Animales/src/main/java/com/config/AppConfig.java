package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Factory.Animal_Factory;

@Configuration
public class AppConfig {
	    @Bean 
	    public Animal_Factory animalFactory() {
	        return new Animal_Factory();
	    }
}
