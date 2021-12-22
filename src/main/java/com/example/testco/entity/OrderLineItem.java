package com.example.testco.entity;

public class OrderLineItem {
  private Product product;

  private int qty;

  public OrderLineItem() {}

  public OrderLineItem(Product product, int qty) {
    this.product = product;
    this.qty = qty;
  }

  public int getQty() {
    return qty;
  }

  public int getTotal() {
    return qty * product.getPrice();
  }

  public void increaseQtyBy(int qty) {
    this.qty += qty;
  }
}
