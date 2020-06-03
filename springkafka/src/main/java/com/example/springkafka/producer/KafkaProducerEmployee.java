package com.example.springkafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springkafka.model.Employee;

@RestController
@RequestMapping("employee")
public class KafkaProducerEmployee 
{
	@Autowired
   private KafkaTemplate<String, Employee> kafkaTemplate;
   private static final String TOPIC="EMP_PUBLISH1"; 
   
    @GetMapping("/publish/{empName}")
	public String post(@PathVariable("empName") final String empName)
	{
    	Employee emp=new Employee(empName,"Account",100000L);
    	kafkaTemplate.send(TOPIC, emp);
	     return "published successfully";
	}
}
