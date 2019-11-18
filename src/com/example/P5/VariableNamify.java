package com.example.P5;

import java.util.Arrays;
import java.util.List;

/*******************************************************************************
 Write a function variableNameify(words) that takes in an array of words. The function
 should return a string representing the variable name obtained by combining the
 words and captitalizing them in mixCased style.
 Examples:
 variableNameify(['is', 'prime']) => 'isPrime'
 variableNameify(['remove', 'last', 'vowel']) => 'removeLastVowel'
 variableNameify(['MaX', 'VALUE']) => 'maxValue'
 *******************************************************************************/


public class VariableNamify {
  public static String varibleNamify(List<String> words) {
    StringBuilder namifiedVariable = new StringBuilder(words.get(0).toLowerCase());

    for (int i = 1; i < words.size(); i++) {
      namifiedVariable.append(words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1).toLowerCase());
    }

    return namifiedVariable.toString();
  }

  public static void main(String[] args) {
    List<String> words = Arrays.asList("MaX", "VALUE", "MOuSe");
    String result = VariableNamify.varibleNamify(words);
    System.out.println(result);
  }
}
