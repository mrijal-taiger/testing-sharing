package com.example.testco.entity;

import com.example.testco.exception.ProductValidationException;

public class Product {
  private int id;

  private String name;

  private int price;

  public Product(int id, String name, int price) throws Exception {
    this(name, price);
    this.id = id;
  }

  public Product(String name, int price) throws Exception {
    if (price <= 0) {
      throw new ProductValidationException("Price should be greater than 0");
    }
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
