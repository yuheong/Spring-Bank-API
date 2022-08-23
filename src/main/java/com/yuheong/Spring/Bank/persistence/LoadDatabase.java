package com.yuheong.Spring.Bank.persistence;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yuheong.Spring.Bank.model.Customer;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CustomerRepository customerRepository) {

        return args -> {
            log.info("Preloading " + customerRepository.save(new Customer("Tom Hanks")));
            log.info("Preloading " + customerRepository.save(new Customer("Abraham Lincoln")));
        };
    }
}
