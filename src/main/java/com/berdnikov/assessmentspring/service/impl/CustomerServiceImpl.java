package com.berdnikov.assessmentspring.service.impl;

import com.berdnikov.assessmentspring.model.Customer;
import com.berdnikov.assessmentspring.repository.CustomerRepository;
import com.berdnikov.assessmentspring.service.CustomerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(@Qualifier("customerRepository") CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
