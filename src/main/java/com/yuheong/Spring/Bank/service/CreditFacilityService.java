package com.yuheong.Spring.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuheong.Spring.Bank.model.CreditFacility;
import com.yuheong.Spring.Bank.persistence.CreditFacilityRepository;

@Service
public class CreditFacilityService {
    private final CreditFacilityRepository creditFacilityRepository;
    private final CustomerService customerService;

    @Autowired
    public CreditFacilityService(CreditFacilityRepository creditFacilityRepository, CustomerService customerService) {
        this.creditFacilityRepository = creditFacilityRepository;
        this.customerService = customerService;
    }

    public CreditFacility openCreditFacility(Long customerId) {
        // TODO: check customer exist
        // TODO: check credit facility exist
        if (creditFacilityRepository.findByCustomerIdIs(customerId) != null) {
            System.out.println("HEY");
            return null;
        }
        return creditFacilityRepository.save(new CreditFacility(customerId));
    }

    public CreditFacility getFacilityByCustomerId(Long customerId) {
        return creditFacilityRepository.findByCustomerIdIs(customerId);
    }

    public CreditFacility setCreditFacilityApproval(Long id, boolean isApproved) {
        CreditFacility creditFacility = creditFacilityRepository.findById(id).get();
        return creditFacility;
    }
}
