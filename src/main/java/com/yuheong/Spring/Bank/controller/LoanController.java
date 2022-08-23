package com.yuheong.Spring.Bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yuheong.Spring.Bank.controller.request.LoanRequest;
import com.yuheong.Spring.Bank.model.Loan;
import com.yuheong.Spring.Bank.service.LoanService;

@RestController
public class LoanController {
    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/loans")
    Loan createLoan(@RequestBody LoanRequest loanRequest) {
        return loanService.createLoan(loanRequest);
    }

    @PostMapping("/loans/{id}/complete_payment")
    Loan completePayment(@PathVariable Long id) {
        return loanService.completeLoanPayment(id);
    }

    @GetMapping("/loans")
    List<Loan> getAllCustomerLoans(@RequestParam(name="customer_id") Long customerId) {
        return loanService.getAllCustomerLoans(customerId);
    }
}
