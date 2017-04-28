package jms.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jms.producer.Producer;

public class ProducerApp {
	public static void main(String [] args){
		  @SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("jmsConfigure.xml");
		  Producer pro = (Producer)app.getBean("producer");
		 for(int i=0;i<100;i++){
			 pro.send();
		 }
	}
}
