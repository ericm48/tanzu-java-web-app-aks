package com.eric.hellospring;


import static org.assertj.core.api.AssertionsForClassTypes.anyOf;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HelloSpringController.class)
@ContextConfiguration(classes=WebApplication.class)

class HelloSpringControllerTest 
{
    @Autowired
    private HelloSpringController controller;

    @Autowired
    private MockMvc mockMvc;
    private static String theBaseResponse           = "Greetings from Spring Boot + Tanzu!!";
    private static String theFullResponseBash       = "Greetings from Spring Boot + Tanzu!! The Custom Value Be: | ValueFrom: Local Bash-OS| The last part!";
    private static String theFullResponseMissing    = "Greetings from Spring Boot + Tanzu!! The Custom Value Be: | ** NO EVAR PRESENT **| The last part!";

@Test
    void testRootURLResponseFAIL() throws Exception 
    {        
        mockMvc
            .perform(get("/"))
            .andExpect(status().isNotFound());
    }    

    @Test
    void testGreetBaseResponseSUCCESS() throws Exception 
    {        
        
        mockMvc
            .perform(get("/greet"))
            .andExpect(status().isOk());

        assertTrue( controller.greet().contains( theBaseResponse ) );            
    }

    @Test
    void testGreetFullResponseSUCCESS() throws Exception
    {        
        mockMvc
            .perform(get("/greet"))
            .andExpect(status().isOk());

        assertTrue(( controller.greet().contains( theFullResponseMissing )) || (controller.greet().contains( theFullResponseBash )) );

    }    
}
