package com.berdnikov.assessmentspring.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;
    @BeforeEach
    void setUp(){
        customer = new Customer();
    }
    @Test
    void getId() {
        Long idValue = 4L;
        customer.setId(idValue);

        assertEquals(idValue, customer.getId());
    }
}