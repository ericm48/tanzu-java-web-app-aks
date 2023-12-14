package com.eric.hellospring;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
//import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
//import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;

@SpringBootApplication
public class WebApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(WebApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner commandLineRunner(ApplicationContext ctx) 
	// {
	// 	return args -> {

	// 		System.out.println("Shall WE Inspect the beans provided by Spring Boot: ");

	// 		String[] beanNames = ctx.getBeanDefinitionNames();
	// 		Arrays.sort(beanNames);
			
	// 		for (String beanName : beanNames) 
	// 		{
	// 			System.out.println( beanName );
	// 		}

	// 	};

	// }
	
    // @Bean
	// public HttpTraceRepository htttpTraceRepository() 
	// {
	// 	return new InMemoryHttpTraceRepository();
	// }
}
