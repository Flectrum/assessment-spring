package com.berdnikov.assessmentspring.controller;

import com.berdnikov.assessmentspring.model.Product;
import com.berdnikov.assessmentspring.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }
}
