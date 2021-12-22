package com.example.testco.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {
  @Test
  public void testGetLineItemsCount() throws Exception {
    Product product1 = new Product(1, "Carrot", 10);
    Product product2 = new Product(2, "Onion", 5);
    Order order = Order.create();
    order.add(product1, 1);
    order.add(product2, 3);

    assertEquals(2, order.lineItemsCount());
  }

  @Test
  public void testGetTotalOrder() throws Exception {
    Product product1 = new Product(1, "Carrot", 10);
    Product product2 = new Product(2, "Onion", 5);
    Order order = Order.create();
    order.add(product1, 1);
    order.add(product2, 3);

    assertEquals(25, order.getTotal());
  }

  @Test
  public void addSameProductTwiceGetLineItemsCount() throws Exception {
    Product product1 = new Product(1, "Carrot", 10);
    Product product2 = new Product(2, "Onion", 5);
    Order order = Order.create();
    order.add(product1, 1);
    order.add(product2, 3);
    order.add(product1, 1);

    assertEquals(2, order.lineItemsCount());
  }

  @Test
  public void getTotalLineItemProductCount() throws Exception {
    Product product1 = new Product(1, "Carrot", 10);
    Product product2 = new Product(2, "Onion", 5);
    Order order = Order.create();
    order.add(product1, 1);
    order.add(product2, 3);
    order.add(product1, 1);

    assertEquals(5, order.totalLineItemProductsCount());
  }
}
