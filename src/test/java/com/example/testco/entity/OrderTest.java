package com.example.testco.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {
  @Test
  public void testGetTotalOrder() throws Exception {
    Product product1 = new Product(1, "Carrot", 10);
    Product product2 = new Product(2, "Onion", 5);
    Order order = Order.create();
    order.add(product1, 1);
    order.add(product2, 3);

    assertEquals(2, order.lineItemsCount());
  }
}
