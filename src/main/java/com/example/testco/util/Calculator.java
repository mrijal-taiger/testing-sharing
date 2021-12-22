package com.example.testco.util;

public class Calculator {
  public int sum(int a, int... b) {
    int result = a;
    for (int number : b) {
      result += number;
    }
    return result;
  }
}
