package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping(value = "/publish")
    public String sendMessageToKafkaTopic(@RequestBody Order order) {
        System.out.println(order.toString());
        this.producer.sendMessage(order);
        return order.toString();
    }
}