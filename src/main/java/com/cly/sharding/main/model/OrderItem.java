package com.cly.sharding.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Filename OrderItem.java
 * @description
 * @Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/2 14:11</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Entity
@Table(name = "t_order_item")
public class OrderItem {

    @Id
    @Column(name = "item_id")
    private Long itemId;

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

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}
