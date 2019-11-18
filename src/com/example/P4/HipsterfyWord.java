package com.example.P4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*******************************************************************************
 Write a function hipsterfyWord(word) that takes takes in a string and returns
 the string with the last vowel removed. 'y' is not a vowel.
 Examples:
 hipsterfyWord('proper') => 'propr'
 hipsterfyWord('tonic') => 'tonc'
 hipsterfyWord('PANTHER') => 'PANTHR'
 hipsterfyWord('BACKWARDS') => 'BACKWRDS'
 *******************************************************************************/

public class HipsterfyWord {
  public static String hipsterfyWord(String word) {
    List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
    List<String> strings = Arrays.asList(word.split(""));

    for (int i = strings.size() - 1; i >= 0; i--) {
      String currentString = strings.get(i);

      if (vowels.contains(currentString)) {
        List<String> first = new ArrayList<>(strings.subList(0, i));
        List<String> second = new ArrayList<>(strings.subList(i + 1, strings.size()));
        List<String> mergedList = new ArrayList<>(first.size() + second.size());
        mergedList.addAll(first);
        mergedList.addAll(second);

        return String.join("", mergedList);
      }
    }

    return word;
  }

  public static void main(String[] args) {
    String[] strings = new String[] { "proper", "tonic", "PANTHER", "BACKWARDS" };

    for (String str: strings) {
      String result = HipsterfyWord.hipsterfyWord(str);
      System.out.println(result);
    }
  }
}
