package com.example.ecommerce_backend.repository;

import com.example.ecommerce_backend.model.Order;
import com.example.ecommerce_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
}
