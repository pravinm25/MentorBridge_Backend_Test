package com.example.SportsShop.service;

import com.example.SportsShop.dto.ProductDto;
import com.example.SportsShop.entity.ProductEntity;
import com.example.SportsShop.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public ProductEntity addProduct(ProductDto productDto) {
        ProductEntity productEntity = ProductEntity.builder()
                .name(productDto.getName())
                .brand(productDto.getBrand())
                .price(productDto.getPrice())
                .category(productDto.getCategory())
                .build();
        return productRepo.save(productEntity);
    }

    public List<ProductEntity> getAllProdcuts(Pageable pageable) {
        return productRepo.findAll(pageable).getContent();
    }
}
