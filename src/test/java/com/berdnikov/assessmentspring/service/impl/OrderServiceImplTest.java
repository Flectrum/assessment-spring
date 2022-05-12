package com.berdnikov.assessmentspring.service.impl;

import com.berdnikov.assessmentspring.model.Order;
import com.berdnikov.assessmentspring.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class OrderServiceImplTest {

    @InjectMocks
    OrderServiceImpl orderService;

    @Mock
    OrderRepository orderRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        orderService = new OrderServiceImpl(orderRepository);
    }

    @Test
    void createOrder() {}

    @Test
    void searchAllOrdersByDate() {
        Order order = new Order();
        String date = "2015-03-31";
        order.setDate(Date.valueOf(date));
        List<Order> orderList = new ArrayList<>();
        orderList.add(order);

        when(orderRepository.findAll()).thenReturn(orderList);

        List<Order> orders = orderService.searchAllOrdersByDate(date);
        assertEquals(1,orders.size() );
    }
}