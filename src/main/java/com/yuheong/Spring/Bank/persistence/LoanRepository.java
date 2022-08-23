package com.yuheong.Spring.Bank.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuheong.Spring.Bank.model.CreditFacility;
import com.yuheong.Spring.Bank.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findAllByCreditFacilityIdIs(Long creditFacilityId);
}
