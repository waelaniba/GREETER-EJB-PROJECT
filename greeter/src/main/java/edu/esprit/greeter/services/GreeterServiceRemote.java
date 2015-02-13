package edu.esprit.greeter.services;

import javax.ejb.Remote;

@Remote
public interface GreeterServiceRemote {
	
	public String sayHello(String name);
	public int getHashCode();

}
