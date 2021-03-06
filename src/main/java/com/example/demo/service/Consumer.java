package com.example.demo.service;

import com.example.demo.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "orders-consumer", groupId = "group_id")
    public void consume(Order order) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", order));
    }
}