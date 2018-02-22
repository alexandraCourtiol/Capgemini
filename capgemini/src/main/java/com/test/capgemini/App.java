package com.test.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { WebMvcAutoConfiguration.class })
public class App 
{	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
