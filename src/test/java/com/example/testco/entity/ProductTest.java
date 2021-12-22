package com.example.testco.entity;

import static org.junit.Assert.assertEquals;

import com.example.testco.exception.ProductValidationException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductTest {
  @Rule
  public ExpectedException expectedEx = ExpectedException.none();

  @Test(expected = ProductValidationException.class)
  public void when_providedPriceLowerThanZero_throwsProductException() throws Exception {
    new Product("Lettuce", -1);
  }

  @Test(expected = ProductValidationException.class)
  public void when_providedPriceEqualsToZero_throwsProductException() throws Exception {
    new Product("Lettuce", 0);
  }

  @Test
  public void errorMessageIsCorrect() throws Exception {
    String expectedErrorMessage = "Price should be greater than 0";

    expectedEx.expect(ProductValidationException.class);
    expectedEx.expectMessage(expectedErrorMessage);
    new Product("Lettuce", 0);
  }

  @Test
  public void getPrice_returns_correctPrice() throws Exception {
    Product product = new Product("Lettuce", 100);
    assertEquals(100, product.getPrice());
  }
}
