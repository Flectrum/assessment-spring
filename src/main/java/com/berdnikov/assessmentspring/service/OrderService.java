package com.berdnikov.assessmentspring.service;

import com.berdnikov.assessmentspring.model.Customer;
import com.berdnikov.assessmentspring.model.Order;
import com.berdnikov.assessmentspring.model.Product;

import java.sql.Date;
import java.util.List;

public interface OrderService {
    Order createOrder(Order order);

    List<Order> searchAllOrdersByDate(Date date);
}
