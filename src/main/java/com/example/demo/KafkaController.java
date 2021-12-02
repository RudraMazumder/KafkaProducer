package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.confluent.developer.User;

@RestController
public class KafkaController {

	@Autowired
	private KafkaUserProducer producer;
	
	@GetMapping("/pushMessage")
	public void pushMessage(@RequestParam(value = "name") String name, @RequestParam(value = "age") Integer age) {
		
		User user = new User(name, age);
		producer.sendMessage(user);
	}
	
}
