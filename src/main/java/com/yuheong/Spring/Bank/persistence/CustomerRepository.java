package com.yuheong.Spring.Bank.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuheong.Spring.Bank.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
