package com.example.P4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*******************************************************************************
 Write a function valueConcat(array, obj) that takes in an array and object
 The function should return a new array where each element is concatenated with
 it's corresponding value from the object.
 Examples:
 valueConcat(['alex', 'maurice', 'meagan', 'ali'], {alex: 'bronca', ali: 'harris'})
 => [ 'alexbronca', 'maurice', 'meagan', 'aliharris' ]
 valueConcat(['a', 'b', 'c'], {b: 2, c: 3})
 => [ 'a', 'b2', 'c3' ]
 *******************************************************************************/

public class ValueConcat {
  public static List<String> valueConcat(List<String> list, HashMap<String, String> map) {
    List<String> newList = new ArrayList<>();

    for (String ele: list) {
      if (map.containsKey(ele)) {
        newList.add(ele + map.get(ele));
      } else {
        newList.add(ele);
      }
    }

    return newList;
  }

  public static void main(String[] args) {
    List<String> list = Arrays.asList("alex", "maurice", "meagan", "ali");
    HashMap<String, String> map = new HashMap<String, String>() {{
      put("alex", "bronca");
      put("ali", "harris");
    }};
    List<String> result = ValueConcat.valueConcat(list, map);
    System.out.println(result);
  }
}
