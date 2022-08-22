package com.yuheong.Spring.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuheong.Spring.Bank.controller.request.LoanRequest;
import com.yuheong.Spring.Bank.model.CreditFacility;
import com.yuheong.Spring.Bank.model.Loan;
import com.yuheong.Spring.Bank.persistence.LoanRepository;

@Service
public class LoanService {
    private final CreditFacilityService creditFacilityService;
    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(CreditFacilityService creditFacilityService, LoanRepository loanRepository) {
        this.creditFacilityService = creditFacilityService;
        this.loanRepository = loanRepository;
    }

    public Loan createLoan(LoanRequest loanRequest) {
        CreditFacility creditFacility = creditFacilityService.getFacilityByCustomerId(loanRequest.getCustomerId());
        Loan newLoan = new Loan();
        newLoan.setCreditFacilityId(creditFacility.getId());
        newLoan.setLoanType(loanRequest.getLoanType());
        newLoan.setLoanAmount(loanRequest.getLoanAmount());
        newLoan.setDueDate(loanRequest.getDueDate());
        newLoan.setInterestRate(loanRequest.getInterestRate());
        return loanRepository.save(newLoan);
    }

    public Loan completeLoanPayment(Long id) {
        Loan loan = loanRepository.findById(id).get();
        loan.setPaid(true);
        return loanRepository.save(loan);
    }
}
