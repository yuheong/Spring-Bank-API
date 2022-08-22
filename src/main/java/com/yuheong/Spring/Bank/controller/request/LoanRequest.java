package com.yuheong.Spring.Bank.controller.request;

import java.util.Date;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.yuheong.Spring.Bank.model.LoanType;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LoanRequest {
    private final Long customerId;
    private final LoanType loanType;
    private final Double loanAmount;
    private final Date dueDate;
    private final Float interestRate;
}
