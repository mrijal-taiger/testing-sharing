package com.example.testco.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.example.testco.entity.Product;
import com.example.testco.repo.ProductRepository;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
  @Mock
  private ProductRepository productRepository;

  @InjectMocks
  private ProductService productService;

  @Test
  public void whenProductIsExists_IsExists_returnsTrue() throws Exception {
    int productId = 1;
    Product product = new Product(productId, "Macbook", 2000);
    when(productRepository.findById(productId)).thenReturn(Optional.of(product));

    assertEquals(true, productService.isProductExists(productId));
  }

  @Test
  public void whenProductIsNotExists_IsExists_returnsFalse() throws Exception {
    int productId = 2;
    when(productRepository.findById(productId)).thenReturn(Optional.empty());

    assertEquals(false, productService.isProductExists(productId));
  }
}
