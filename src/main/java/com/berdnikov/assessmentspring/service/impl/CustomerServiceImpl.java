package com.berdnikov.assessmentspring.service.impl;

import com.berdnikov.assessmentspring.model.Customer;
import com.berdnikov.assessmentspring.repository.CustomerRepository;
import com.berdnikov.assessmentspring.service.CustomerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(@Qualifier("customerRepository") CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


}
