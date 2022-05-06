package com.berdnikov.assessmentspring.service.impl;

import com.berdnikov.assessmentspring.model.Product;
import com.berdnikov.assessmentspring.repository.ProductRepository;
import com.berdnikov.assessmentspring.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(@Qualifier("productRepository") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }
}
