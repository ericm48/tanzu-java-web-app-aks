package com.eric.hellospring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@RestController
public class HelloSpringController 
{

	private static final Log methIDgreet;

    static
    {
        methIDgreet          = LogFactory.getLog(HelloSpringController.class.getName() + ".greet()");
    }	

	@RequestMapping("/greet")
	public String greet() 
	{
		Log logger = methIDgreet;

        logger.debug("Begins...");

		String message1 		= "Greetings from Spring Boot + Tanzu!! The Custom Value Be: | ";
		String message2  		= "| The last part!";		
		String messageOut 		= null;
		String messsageFromVar 	= null;
		
		messsageFromVar = System.getenv("MY_VARIABLE");

		if ( messsageFromVar != null )
		{
			messageOut = message1 + messsageFromVar + message2; 
		}

		System.out.println( messageOut );

        logger.info("messageOut: " + messageOut);

        logger.debug("Ends...");

		return( messageOut );
	}

}
