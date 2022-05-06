package com.berdnikov.assessmentspring.service;

import com.berdnikov.assessmentspring.model.Order;

import java.util.List;

public interface OrderService {
    void createOrder(Order order);

    List<Order> searchAllOrdersByDate(String date);
}
