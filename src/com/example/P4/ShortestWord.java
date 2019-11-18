package com.example.P4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*******************************************************************************
 Write a function shortestWord(sentence) that returns the shortest word of a sentence.
 You can assume that the words of the sentence all have different lengths.
 Examples:
 shortestWord('app academy is cool') => 'is'
 shortestWord('bootcamp prep') => 'prep'
 *******************************************************************************/

public class ShortestWord {
  public static String shortestWord(String str) {
    List<String> listOfWords = Arrays.asList(str.split(" "));
    String currentShortestWord = listOfWords.get(0);
    List<String> subListOfWords = new ArrayList<>(listOfWords.subList(1, listOfWords.size()));

    for(String word: subListOfWords) {
      if (word.length() < currentShortestWord.length()) currentShortestWord = word;
    }

    return currentShortestWord;
  }

  public static void main(String[] args) {
    String result = ShortestWord.shortestWord("bootcamp prep");
    System.out.println(result);
  }
}
