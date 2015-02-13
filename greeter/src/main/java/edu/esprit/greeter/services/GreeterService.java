package edu.esprit.greeter.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class GreeterService
 */
@Stateless(name = "greeterSRVC")
public class GreeterService implements GreeterServiceRemote {

    /**
     * Default constructor. 
     */
    public GreeterService() {
        
    	System.out.println("Inside Greeter Service Constructor");
    }

	@Override
	public String sayHello(String name) {
		
		return "Hello " + name;
	}
	
	
	
	@PostConstruct
	public void init(){
	
		System.out.println("Greeter Service initiated");
	}
	
	@PreDestroy
	public void cleanUp(){
		
		System.out.println("Releasing Greeter Service");
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int getHashCode() {
		return hashCode();
	}

}
