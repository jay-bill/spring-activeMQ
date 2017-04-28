package jms.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerApp {
	public static void main(String [] args){
		ApplicationContext app = new ClassPathXmlApplicationContext("jmsConfigure.xml");		 
	}
}
