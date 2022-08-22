package com.yuheong.Spring.Bank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Loan {
    private @Id @GeneratedValue Long id;
    private Long creditFacilityId;
    LoanType loanType;
    double loanAmount;
    Date dueDate;
    float interestRate;
    boolean paid;
}
