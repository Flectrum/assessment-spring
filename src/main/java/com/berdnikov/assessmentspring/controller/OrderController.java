package com.berdnikov.assessmentspring.controller;

import com.berdnikov.assessmentspring.model.Order;
import com.berdnikov.assessmentspring.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);
    }

    @RequestMapping(value = "/{date}", method = RequestMethod.GET)
    public List<Order> getOrdersByDate(@PathVariable String date){
        return orderService.searchAllOrdersByDate(date);
    }
}
