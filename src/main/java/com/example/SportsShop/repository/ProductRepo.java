package com.example.SportsShop.repository;

import com.example.SportsShop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,String> {
}
