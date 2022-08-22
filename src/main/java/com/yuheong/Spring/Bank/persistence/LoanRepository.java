package com.yuheong.Spring.Bank.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuheong.Spring.Bank.model.CreditFacility;
import com.yuheong.Spring.Bank.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
