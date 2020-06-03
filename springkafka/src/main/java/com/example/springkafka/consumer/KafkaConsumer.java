package com.example.springkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.springkafka.model.Employee;

@Service
public class KafkaConsumer 
{
	@KafkaListener(topics="KAFKA_EXAMPLE",groupId = "group_id")
	public void consume(String msg)
	{
		System.out.println("Consumed messages==>>>"+msg);
	}
	
	@KafkaListener(topics="EMP_PUBLISH1",groupId = "group_json",containerFactory = "employeeKafkaListenerContainerFactory")
	public void employeeConsumer(Employee emp)
	{
	  System.out.println("Hello I am in employeeConsumer");
	   System.out.println("Consumed JSON Message======>>>>"+emp);
	}
}
