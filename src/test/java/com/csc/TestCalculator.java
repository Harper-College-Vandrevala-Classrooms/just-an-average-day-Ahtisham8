package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void itWorks() {
    assertEquals(true, true);
  }

  @Test
  void testMaximumFunctionForLoop() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(50, calculator.maximumUsingForLoop(numbers));
  }
  @Test
  void testMinimumFunctionForLoop() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(10, calculator.minimumUsingForLoop(numbers));
  }
  @Test
  void testSumFunctionForLoop() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(150, calculator.sumUsingForLoop(numbers));
  }
  @Test
  void testAvgFunctionForLoop() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(30, calculator.averageUsingForLoop(numbers));
  }


  @Test
  void testMaximumStreams() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(50, calculator.maximumUsingStream(numbers));
  }
  @Test
  void testMinimumStreams() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(10, calculator.minimumUsingStream(numbers));
  }
  @Test
  void testsumStreams() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(150, calculator.sumUsingStream(numbers));
  }
  @Test
  void testAvgStreams() {
    int[] numbers = {10, 20, 30, 40, 50};
    assertEquals(30, calculator.averageUsingStream(numbers));
  }
}
