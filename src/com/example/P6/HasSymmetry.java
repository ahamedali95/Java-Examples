package com.example.P6;

import java.util.*;


/*******************************************************************************
 Write a function hasSymmetry(array) that takes in an array. The function should
 return true if the array has symmetry, false otherwise. For an array to have symmetry,
 it should be the same forwards and backwards.
 TIP:
 In JavaScript, it is not possible to compare arrays for equality with `===`.
 In other words, `[1, 2, 3] === [1, 2, 3]` evaluates to false.
 Examples:
 hasSymmetry([1, 2, 3, 3, 2, 1]) => true
 hasSymmetry([1, 2, 3, 3, 4, 1]) => false
 hasSymmetry(['cat', 'dog', 'bird', 'dog', 'cat']) => true
 hasSymmetry(['cat', 'dog', 'bird', 'bird', 'cat']) => false
 *******************************************************************************/

public class HasSymmetry {
//  public static boolean T[] addToArray(T... list) {
//    for (int i = 0; i < Math.floor(list.size()/2); i++) {
//      if (list.get(i) != list.get(list.size() - i - 1)) {
//        return false;
//      }
//    }
//
//    return true;
//  }

  public static boolean hasSymmetry(List<Integer> list) {
    for (int i = 0; i < Math.floor(list.size()/2); i++) {
      if (list.get(i) != list.get(list.size() - i - 1)) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,3,4,1);
    boolean result = HasSymmetry.hasSymmetry(list);
    System.out.println(result);
  }
}
