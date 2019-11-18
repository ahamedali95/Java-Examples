package com.example.P4;

/*******************************************************************************
 Write a function greatestCommonFactor(num1, num2) that returns the largest number
 that divides both `num1` and `num2`.
 Examples:
 greatestCommonFactor(15, 25) => 5
 greatestCommonFactor(16, 24) => 8
 greatestCommonFactor(7, 11) => 1
 *******************************************************************************/


public class GreatestCommonFactor {
  public static int greatestCommonFactor(int num1, int num2) {
    int index = 1;
    Integer gcf = null;

    while(index < num1 && index < num1) {
      if (num1 % index == 0 && num2 % index == 0) gcf = index;
      index++;
    }

    return gcf;
  }

  public static void main(String[] args) {
    int result = GreatestCommonFactor.greatestCommonFactor(7,11);
    System.out.println(result);
  }
}
