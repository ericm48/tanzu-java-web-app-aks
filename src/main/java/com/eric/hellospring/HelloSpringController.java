package com.eric.hellospring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
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
		String messageNoVar     = "** NO EVAR PRESENT **";

		messsageFromVar = System.getenv("MY_VARIABLE");

		if ( messsageFromVar != null )
		{
			messageOut = message1 + messsageFromVar + message2; 
		}
		else
		{
			messageOut = message1 + messageNoVar + message2; 
		}

        logger.info("messageOut: " + messageOut);

        logger.debug("Ends...");

		return( messageOut );
	}

}
