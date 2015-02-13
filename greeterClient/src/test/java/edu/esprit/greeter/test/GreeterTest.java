package edu.esprit.greeter.test;

import static org.junit.Assert.*;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.greeter.services.GreeterServiceRemote;

public class GreeterTest {

	GreeterServiceRemote greeterServiceRemote;
	
	@Before
	public void setUp() throws Exception {

		Context ctx = new InitialContext();
		Object proxy = ctx.lookup("/greeter/greeterSRVC!" + GreeterServiceRemote.class.getCanonicalName());
		greeterServiceRemote = (GreeterServiceRemote) proxy;

	}

	@Test
	public void itshouldSayHello_4_SIM() {
		
		assertEquals("Hello 4 SIM", greeterServiceRemote.sayHello("4 SIM"));
		
	}
	
	@Test
	public void itshouldSayHello_4_GL() {
		
		assertEquals("Hello 4 GL", greeterServiceRemote.sayHello("4 BI"));
		
	}
	
	

}
