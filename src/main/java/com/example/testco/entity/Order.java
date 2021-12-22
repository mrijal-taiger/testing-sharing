package com.example.testco.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {
  private Map<Integer, OrderLineItem> lineItems = new HashMap<>();

  private Order() { }

  public void add(Product product,int qty) {
    if (lineItems.containsKey(product.getId())) {
      OrderLineItem lineItem = lineItems.get(product.getId());
      lineItem.increaseQtyBy(qty);
    } else {
      OrderLineItem lineItem = new OrderLineItem(product, qty);
      lineItems.put(product.getId(), lineItem);
    }
  }

  public int getTotal() {
    return lineItems.values().stream()
        .map(item -> item.getTotal())
        .reduce(0, (subTotal, lineItemTotal) -> subTotal + lineItemTotal);
  }

  public int lineItemsCount() {
    return lineItems.size();
  }

  public static Order create() {
    return new Order();
  }
}
