package com.cly.sharding.main.Controller;

import com.cly.sharding.main.model.Order;
import com.cly.sharding.main.repository.OrderRepository;
import com.dangdang.ddframe.rdb.sharding.id.generator.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Filename OrderController.java
 * @description
 * @Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/2 14:15</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private IdGenerator idGenerator;

    @RequestMapping("add")
    public Object add(){
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId((long) i);
            order.setOrderId((long) i);
            orderRepository.save(order);
        }
        for (int i = 10; i < 20; i++) {
            Order order = new Order();
            order.setUserId((long) i + 1);
            order.setOrderId((long) i);
            orderRepository.save(order);
        }

        Order order = new Order();
        order.setUserId(1L);
        order.setOrderId(idGenerator.generateId().longValue());
        orderRepository.save(order);

        return "success";
    }

    @RequestMapping("queryAll")
    private Object queryAll() {
        return orderRepository.findAll();
    }

}
