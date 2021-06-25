package com.springboot.project.kafkaconsumerservice.listener;

import com.springboot.project.kafkaconsumerservice.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "KafkaTopic3")
    public void consumeMessage(User user){
        System.out.println("Consumed JSON Message: " + user);
    }
}
