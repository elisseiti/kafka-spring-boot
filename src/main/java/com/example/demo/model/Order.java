package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private long id;

    @Override
    public String toString() {
        return "User{" +
                "status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}