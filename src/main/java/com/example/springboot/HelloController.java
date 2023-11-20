package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController 
{
	@RequestMapping("/")
	public String index() 
	{
		String message1 		= "Greetings from Spring Boot + Tanzu!! The ZOOBIE Custom Value Be: | ";
		String message2  		= "| The last part!";		
		String messageOut 		= null;
		String messsageFromVar 	= null;
		
		messsageFromVar = System.getenv("MY_VARIABLE");

		if ( messsageFromVar != null )
		{
			messageOut = message1 + messsageFromVar + message2; 
		}

		System.out.println( messageOut );

		// Changed Code

		return( messageOut );
	}

}
