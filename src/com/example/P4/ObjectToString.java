package com.example.P4;
import com.sun.deploy.util.StringUtils;

import java.util.HashMap;

/*******************************************************************************
 * Write a function `objectToString(count)` that takes in a char count object
 * and returns a string representing the counts of each character. Examples:
 * objectToString({a : 2, b: 4, c: 1}) => 'aabbbbc' objectToString({b: 1, o: 2,
 * t: 1}) => 'boot'
 *******************************************************************************/

class ObjectToString {
  public static StringBuilder objectToString(HashMap<String, Integer> count) {
    StringBuilder str = new StringBuilder();

    count.forEach((key, value) -> {
      for (int i = 0; i < value; i++) {
        str.append(key);
      }
    });

    return str;
  }

  public static void main(String[] args) {
    HashMap<String, Integer> count = new HashMap<String, Integer>() {
      {
        put("a", 2);
        put("b", 4);
        put("c", 1);
      }
    };
    StringBuilder result = ObjectToString.objectToString(count);
    System.out.println(result);
  }
}