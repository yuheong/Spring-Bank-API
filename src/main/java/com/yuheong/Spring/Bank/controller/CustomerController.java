package com.yuheong.Spring.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yuheong.Spring.Bank.model.Customer;
import com.yuheong.Spring.Bank.service.CustomerService;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    List<Customer> listCustomers() {
        return customerService.allCustomers();
    }

    @GetMapping("/customers/{id}")
    Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }

    @PostMapping("/customers")
    Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }
}
