package com.example.ecommerce_backend.repository;

import com.example.ecommerce_backend.model.Cart;
import com.example.ecommerce_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{
}
