package com.cly.sharding.main.repository;

import com.cly.sharding.main.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Filename OrderRepository.java
 * @description
 * @Version 1.0
 * <li>@author: jiang.zheng</li>
 * <li>Date: 2017/8/2 14:17</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
