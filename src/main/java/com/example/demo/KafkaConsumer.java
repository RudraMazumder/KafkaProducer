package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class); 

	/*
	 * @KafkaListener(topics = "MyTopic", groupId = "MyGroup") public void
	 * consumeMessage(String message) { LOGGER.info("Consuming message {}",
	 * message); }
	 */
}
