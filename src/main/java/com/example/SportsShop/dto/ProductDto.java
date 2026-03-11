package com.example.SportsShop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ProductDto {
    private String name;
    private String brand;
    private double price;
    private String category;
}
