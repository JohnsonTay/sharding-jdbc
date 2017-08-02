package com.cly.sharding.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Filename Order.java
 * @description
 * @Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/2 14:11</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "user_id")
    private Long userId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
