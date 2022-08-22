package com.yuheong.Spring.Bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CreditFacility {
    private @Id
    @GeneratedValue Long id;
    private Long customerId;
    private boolean approved;

    protected CreditFacility() {
    }

    public CreditFacility(Long customerId) {
        this.customerId = customerId;
    }
}
