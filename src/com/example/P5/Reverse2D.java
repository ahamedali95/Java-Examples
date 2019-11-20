package com.example.P5;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
  public static List<String> getReversedList(List<String> list) {
    Collections.reverse(list);
    return list;
  }

  public static String reverse2D(List<List<String>> list) {
    /*********************************************************
     * INITIAL SOLUTION with regular for-loop. TIME COMPLEXITY - O(n^2)
    StringBuilder str = new StringBuilder();

    for (int i = list.size() - 1; i >= 0; i--) {
      List<String> innerList = list.get(i);

      for (int j = innerList.size() - 1; j >= 0; j--) {
        str.append(innerList.get(j));
      }
    }

     return str.toString();
     **********************************************************/


    /*********************************************************
     * SECOND SOLUTION using JAVA 8 streams with forEach method
     *********************************************************/
     Collections.reverse(list);
     StringBuilder str = new StringBuilder();

     list.stream()
             .forEach(innerList -> {
               Collections.reverse(innerList);
               str.append(StringUtils.join(innerList, ""));
             });
     return str.toString();

    /*********************************************************
     * NON-WORKING SOLUTION using JAVA 8 streams with reduce method
     Collections.reverse(list);
     return list.stream().reduce("", (accumulator, innerList) -> accumulator + StringUtils.join(Reverse2D.getReversedList(innerList), ""));
     *********************************************************/
  }

  public static void main(String[] args) {
    List<String> innerList1 = Arrays.asList("Julian", "Matt", "Mike");
    List<String> innerList2 = Arrays.asList("Oscar", "Patrick");
    List<List<String>> twoDimensionalList = Arrays.asList(innerList1, innerList2);
    String result = Reverse2D.reverse2D(twoDimensionalList);

    System.out.println(result);
  }
}
