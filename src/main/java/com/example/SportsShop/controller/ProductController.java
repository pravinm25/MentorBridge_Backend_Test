package com.example.SportsShop.controller;

import com.example.SportsShop.dto.ProductDto;
import com.example.SportsShop.entity.ProductEntity;
import com.example.SportsShop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
        return "Product added sucessfully";
    }

    @GetMapping("/getall")
    public List<ProductEntity> getAllProducts(@RequestParam int pageNum, @RequestParam int pageSize){
        return productService.getAllProdcuts(PageRequest.of(pageNum, pageSize));
    }
}
