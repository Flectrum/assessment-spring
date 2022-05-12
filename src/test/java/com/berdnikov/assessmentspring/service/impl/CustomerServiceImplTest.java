package com.berdnikov.assessmentspring.service.impl;

import com.berdnikov.assessmentspring.model.Customer;
import com.berdnikov.assessmentspring.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

class CustomerServiceImplTest {

    @InjectMocks
    CustomerServiceImpl customerService;

    @Mock
    CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        customerService = new CustomerServiceImpl(customerRepository);
    }

    @Test
    void getAllCustomers() {
        List<Customer> customerList = Arrays.asList(
                new Customer(1L,"1k4hj56", "Maynard James Keenan", "puscifer@album.buy", "+3725555555"),
                (new Customer(2L,"2j5un77","Adam Jones", "gibson@solo.play", "+372666666")),
                (new Customer(3L,"6jfjf8ke", "Danny Carey", "temperst@octopus.com","+492333257")),
                (new Customer(4L, "jyj8888","Justin Chancellor", "justinchancellor@toolband.com","+911333222")));

        doReturn(customerList).when(customerRepository).findAll();
        List<Customer> actualCustomers = customerService.getAllCustomers();
        assertThat(actualCustomers).isEqualTo(customerList);
    }
}