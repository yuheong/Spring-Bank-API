package com.yuheong.Spring.Bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {
    private @Id @GeneratedValue Long id;
    private String name;

    protected Customer() {}

    public Customer(String name) {
        this.name = name;
    }
}
