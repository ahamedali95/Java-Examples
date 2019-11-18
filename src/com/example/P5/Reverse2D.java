package com.example.P5;

import java.util.Arrays;
import java.util.List;

/*******************************************************************************
 Write a function reverse2D(array) that takes in a 2D array of strings. The function
 should return a string representing the elements of the array in reverse order.
 Examples:
 var arr1 = [
 ['a', 'b', 'c', 'd'],
 ['e', 'f'],
 ['g', 'h', 'i']
 ];
 reverse2D(arr1) => 'ihgfedcba'
 var arr2 = [
 ['Julian', 'Matt', 'Mike'],
 ['Oscar', 'Patrick']
 ];
 reverse2D(arr2) => 'PatrickOscarMikeMattJulian'
 *******************************************************************************/

public class Reverse2D {
  public static String reverse2D(List<List<String>> list) {
//    Collections.reverse(list).stream()
//            .reduce("", (accumulator, innerList) -> accumulator + StringUtils.join(Collections.reverse(innerList), ""));
    StringBuilder str = new StringBuilder();

    for (int i = list.size() - 1; i >= 0; i--) {
      List<String> innerList = list.get(i);

      for (int j = innerList.size() - 1; j >= 0; j--) {
        str.append(innerList.get(j));
      }
    }

    return str.toString();
  }

  public static void main(String[] args) {
    List<String> innerList1 = Arrays.asList("Julian", "Matt", "Mike");
    List<String> innerList2 = Arrays.asList("Oscar", "Patrick");
    List<List<String>> twoDimensionalList = Arrays.asList(innerList1, innerList2);
    String result = Reverse2D.reverse2D(twoDimensionalList);

    System.out.println(result);
  }
}
