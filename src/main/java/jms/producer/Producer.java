package jms.producer;

import org.springframework.jms.core.JmsOperations;

public class Producer {

	private JmsOperations operation;
	public Producer(JmsOperations operation){
		this.operation = operation;
	}
	
	public void send(){
		operation.convertAndSend("hello,ActiveMQ!");
	}
}
