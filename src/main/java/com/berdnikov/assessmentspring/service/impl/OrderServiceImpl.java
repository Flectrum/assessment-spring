package com.berdnikov.assessmentspring.service.impl;

import com.berdnikov.assessmentspring.model.Order;
import com.berdnikov.assessmentspring.repository.OrderRepository;
import com.berdnikov.assessmentspring.service.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(@Qualifier("orderRepository") OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> searchAllOrdersByDate(String date) {
        return orderRepository.findAll().stream().filter(e -> e.getDate().equals(Date.valueOf(date))).collect(Collectors.toList());
    }
}
