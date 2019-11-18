# JAVA DEVELOPMENT NOTES 

## List 

### New List

```java
import java.util.ArrayList;
import java.util.List;

List<String> list = new ArrayList<DATATYPE>();
```

### Add elements 

```java 
List<String> list = Arrays.asList("Jenny", "Mary", "Mark");
```

### Get an element 

```java 
list.set(INDEX)
```

### Set an element 

```java 
list.get(INDEX, ELEMENT)
```

### Iteration

```java
for (String i: list) {
  System.out.println(i);
}
```

### Join

```java 
StringUtils.join(DELIMITER, LIST);
```

### Convert string to list 

```java 
List<String> list = Arrays.asList(strings);
```

### Convert array to list 

```java 
List<String> list = Arrays.asList(array);
```

### Size 

```java 
list.size()
```

### Reverse 

```java 
import java.util.Collections;

Collections.reverse(list)
```

### Sort 

```java 
import java.util.Collections;

Collections.sort(list)
```

### Slice 

```java 
list.subList(INDEX1, INDEX2[NOT INCLUSIVE]);
```

### Prevent mutation of original list because of actions on list 

```java 
List<String> list = new ArrayList<String>("a","b");
List<String> subList = new ArrayList<String>(list.subList(0, 1));
```

### Contains 

```java 
list.contains(ELEMENT); //=> boolean
```

### Merge two lists

```java 
List<String> first = Arrays.asList("hello" "world");
List<String> second = Arrays.asList("environment" "science");
List<String> mergedList = new ArrayList<>(first.size() + second.size());
mergedList.addAll(first);
mergedList.addAll(second);
```

### Generic list in method parameter

1. Create a method accepting generic type list

```java 
public static List<?> func(List<?> list) {
}
```

OR 

2. Create separate methods to handle each data type list 

```java 
class Main {
    public static List<Integer> func(List<Integer> list) {
    }
    
    public static List<String> func(List<String> list) {
    }
 }
```

## HashMap

### Declare a hashmap with key-value pairs 

```java 
HashMap<String, Integer> newMap = new HashMap<String, Integer>(){{ 
      put("a", 1);
      put("b", 2); 
      put("d", 4);
    }};
```

### Get all keys 

```java 
newMap.keyset();
```

### Get all values

```java 
newMap.values();
```

### Get a property value 

```java 
newMap.get(PROPERTY NAME);
```

### Contains key 

```java 
newMap.containsKey(); //=> boolean
```

### Iteration 

```java 
newMap.forEach((key, value) -> {
    System.out.println(key);
    System.out.println(value);
});
```

OR 

```java 
for (Map.Entry<String, Integer> entry : hash.entrySet()) {
   String key = entry.getKey();
   int num = entry.getValue();
 }
```

## String 

### Use string builder for concatenation in for-loop

```java 
StringBuilder str = new StringBuilder();
    count.forEach((key, value) -> {
       for (int i = 0; i < value; i++) {
         str.append(key);
       }
    });
```

## Array 

### Definition 

```java 
String[] array = new String[] {"a", "b", "c"};
```

### Length 

```java 
array.length 
```

### Clone 

```java
Arrays.copyOfRange(INDEX1, INDEX2[NOT INCLUSIVE]);
```

## Stream

### Reduce 

Here, we are reducing an list of integers in to a single value. In other words,
we are calculating the sum of all elements in the list.

```java 
public static void mainY() {
    // Creating list of integers
    List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

    // Finding sum of all elements
    // here 0 is the starting value of the accumulator
    int sum = array.stream().reduce(0,
            (accumulator, element2) -> accumulator + element2);
     
    // Displaying sum of all elements
    System.out.println("The sum of all elements is " + sum);
}
```

### Map

Here, we are returning a list of elements with element multiplied by 2.

```java 
public static void mainY() {
    // Creating list of integers
    List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

    // Finding sum of all elements
    // Collect it as a list so we can return it
    List<Integer> l = array.stream().map(e -> e * 2).collect(Collectors.toList());

    // Displaying sum of all elements
    System.out.println("The sum of all elements is " + l);
}
```

## Method 

### pass multiple arguments to a method -varargs

```java 
public static createListHelper(String ... args) {
    List<String> list = new ArrayList<>();

    for (String ele: list) {
      
    }

}
```