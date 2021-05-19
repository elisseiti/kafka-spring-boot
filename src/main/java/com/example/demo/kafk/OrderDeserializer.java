package com.example.demo.kafk;

import com.example.demo.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class OrderDeserializer implements Deserializer {


        @Override
        public void close() {

        }


        @Override
        public Order deserialize(String arg0, byte[] arg1) {
            ObjectMapper mapper = new ObjectMapper();
            Order user = null;
            try {
                user = mapper.readValue(arg1, Order.class);
            } catch (Exception e) {

                e.printStackTrace();
            }
            return user;
        }

}