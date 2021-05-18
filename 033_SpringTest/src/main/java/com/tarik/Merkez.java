package com.tarik;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring.xml");
		
		
		
		appCtx.start(); // Context ayaða kaldýrýlýyor
			
		appCtx.refresh(); // istersen tazeleme yapabilirsin aralarda 
		
		appCtx.stop();
				
		appCtx.close();
	
		
		
		
		
		
	}

}
