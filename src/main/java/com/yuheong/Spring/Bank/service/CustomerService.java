package com.yuheong.Spring.Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuheong.Spring.Bank.model.Customer;
import com.yuheong.Spring.Bank.persistence.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> allCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .get();
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
