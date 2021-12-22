package com.example.testco.service;

import com.example.testco.entity.Product;
import com.example.testco.repo.ProductRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

  @Autowired
  private ProductRepository productRepository;

  public boolean isProductExists(int id) {
    Optional<Product> product = productRepository.findById(id);

    return product.isPresent();
  }
}
