package com.example.kafkatest.mvc.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaService {

    @KafkaListener(topics="keereumtest", groupId = "group-id-keereum")
    public void consume(String message) throws IOException {
        System.out.println("Consumed message : " + message);
    }
}
