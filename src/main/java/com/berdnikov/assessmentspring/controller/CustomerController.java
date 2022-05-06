package com.berdnikov.assessmentspring.controller;

import com.berdnikov.assessmentspring.model.Customer;
import com.berdnikov.assessmentspring.service.impl.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createCustomer(@RequestBody Customer customer) {
     customerService.createCustomer(customer);
    }

    @RequestMapping("")
    public List<Customer> allCustomers(){
        return customerService.getAllCustomers();
    }
}
