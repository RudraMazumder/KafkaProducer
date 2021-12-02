package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import io.confluent.developer.User;


@Service
public class KafkaUserProducer {

	private static final Logger logger = LoggerFactory.getLogger(KafkaUserProducer.class);

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;

	@Value("${topic.name}")
	private String topicName;

	void sendMessage(User user) {
		kafkaTemplate.send(topicName, user.getName(), user);
		logger.info("User {} is pushed to topic {}", user.getName(), topicName);

	}

}
