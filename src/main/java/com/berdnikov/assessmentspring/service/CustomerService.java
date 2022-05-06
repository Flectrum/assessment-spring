package com.berdnikov.assessmentspring.service;

import com.berdnikov.assessmentspring.model.Customer;

import java.util.List;

public interface CustomerService {
    void createCustomer(Customer customer);

    List<Customer> getAllCustomers();
}
