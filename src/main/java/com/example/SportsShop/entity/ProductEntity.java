package com.example.SportsShop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sportstable")
@Data
@Builder
public class ProductEntity {
    @Id
    private String name;
    private String brand;
    private double price;
    private String category;
}
