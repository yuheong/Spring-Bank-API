package com.yuheong.Spring.Bank.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuheong.Spring.Bank.model.CreditFacility;

public interface CreditFacilityRepository extends JpaRepository<CreditFacility, Long> {
    CreditFacility findByCustomerIdIs(Long customerId);
}
