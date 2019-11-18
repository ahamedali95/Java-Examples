package com.example.P5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*******************************************************************************
 Write a function isPassing(assessments) that takes in an array of assessment objects.
 The function should return a true if the average assessment score is at least 70.
 It should return false otherwise.
 Examples:
 var assessments1 = [
 {number: 1, score: 60},
 {number: 2, score: 90},
 {number: 3, score: 80},
 {number: 4, score: 100},
 {number: 5, score: 85}
 ];
 isPassing(assessments1) => true
 var assessments2 = [
 {number: 1, score: 60},
 {number: 2, score: 20},
 {number: 3, score: 45}
 ];
 isPassing(assessments2) => false
 *******************************************************************************/

public class IsPassing {
  public static boolean isPassing(List<HashMap<String, Integer>> assessments) {
    int total = 0;


    for (HashMap<String, Integer> assessment: assessments) {
      total += assessment.get("score");
    }


    return total/assessments.size() >= 70;
  }

  public static void main(String[] args) {
    HashMap<String, Integer> assessment1 = new HashMap<String, Integer>() {{
      put("number", 1);
      put("score", 60);
    }};
    HashMap<String, Integer> assessment2 = new HashMap<String, Integer>() {{
      put("number", 2);
      put("score", 90);
    }};
    HashMap<String, Integer> assessment3 = new HashMap<String, Integer>() {{
      put("number", 3);
      put("score", 80);
    }};
    HashMap<String, Integer> assessment4 = new HashMap<String, Integer>() {{
      put("number", 4);
      put("score", 100);
    }};
    HashMap<String, Integer> assessment5 = new HashMap<String, Integer>() {{
      put("number", 5);
      put("score", 85);
    }};
    List<HashMap<String, Integer>> assessments = Arrays.asList(assessment1, assessment2, assessment3, assessment4, assessment5);
    boolean result = IsPassing.isPassing(assessments);
    System.out.println(result);
  }
}
