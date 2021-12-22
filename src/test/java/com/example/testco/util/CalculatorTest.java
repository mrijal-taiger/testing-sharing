package com.example.testco.util;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  private Calculator calculator = new Calculator();

  @Test
  public void testAddingTwoNumber() {
    assertEquals(6, calculator.sum(4, 2));
  }

  @Test
  public void testAddingMoreThanTwoNumber() {
    assertEquals(12, calculator.sum(4, 2, 6));
  }
}
