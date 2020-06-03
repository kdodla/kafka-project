
  package com.example.springkafka.producer;
  
  import org.springframework.beans.factory.annotation.Autowired; 
  import org.springframework.kafka.core.KafkaTemplate; 
  import org.springframework.web.bind.annotation.GetMapping; 
  import  org.springframework.web.bind.annotation.PathVariable; 
  import  org.springframework.web.bind.annotation.RequestMapping;
  import  org.springframework.web.bind.annotation.RestController;
  
  @RestController
  
  @RequestMapping("kafka")
  public class KafkaProducerResource {
  
  @Autowired 
  KafkaTemplate<String, String> kafkatemplate; 
  private final static String TOPIC="KAFKA_EXAMPLE";
  
  @GetMapping("/publish/{msg}")
  public String post(@PathVariable("msg") String   msg) 
  {
	  kafkatemplate.send(TOPIC,msg);
	  return "published successfully";
  } 
  
  }
 