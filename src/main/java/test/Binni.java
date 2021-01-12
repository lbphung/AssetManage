package test;

import org.springframework.stereotype.Component;

public class Binni {
	@Component
	public class Binnik implements Outfit {
	    @Override
	    public void wear() {
	        System.out.println("Binnik");
	    }
	}
}
