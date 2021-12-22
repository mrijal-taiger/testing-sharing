package com.example.testco.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderLineItemTest {
  @Test
  public void testGetTotal() throws Exception {
    Product product = new Product("Bubble tea", 5);
    OrderLineItem lineItem = new OrderLineItem(product, 3);

    assertEquals(15, lineItem.getTotal());
  }
}
