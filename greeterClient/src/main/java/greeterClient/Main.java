package greeterClient;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.esprit.greeter.services.GreeterServiceRemote;

public class Main {
	
	public static void main(String... args){
		
		for(int i = 0; i<50; i++){
			
			Thread t = new Thread(new GreeterTester());
			t.start();
		}
		
	}

}

class GreeterTester implements Runnable {

	@Override
	public void run() {
		
		try {
			
			Context ctx = new InitialContext();
			GreeterServiceRemote greeterServiceRemote = (GreeterServiceRemote) ctx.
					lookup("/greeter/greeterSRVC!" + GreeterServiceRemote.class.getCanonicalName());
			
			System.out.println(greeterServiceRemote.getHashCode());
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
