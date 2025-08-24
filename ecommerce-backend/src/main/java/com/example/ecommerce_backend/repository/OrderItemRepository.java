package com.example.ecommerce_backend.repository;

import com.example.ecommerce_backend.model.OrderItem;
import com.example.ecommerce_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
