package com.example.testco.entity;

import static org.junit.Assert.assertEquals;

import com.example.testco.exception.ProductValidationException;
import org.junit.Test;

public class ProductTest {
  @Test(expected = ProductValidationException.class)
  public void when_providedPriceLowerThanZero_throwsProductException() throws Exception {
    new Product("Lettuce", -1);
  }

  @Test(expected = ProductValidationException.class)
  public void when_providedPriceEqualsToZero_throwsProductException() throws Exception {
    new Product("Lettuce", 0);
  }

  public void getPrice_returns_correctPrice() throws Exception {
    Product product = new Product("Lettuce", 100);
    assertEquals(100, product.getPrice());
  }
}
