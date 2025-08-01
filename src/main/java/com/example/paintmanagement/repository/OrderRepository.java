package com.example.paintmanagement.repository;

import com.example.paintmanagement.entity.Order;
import com.example.paintmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}