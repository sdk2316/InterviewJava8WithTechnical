package javastream.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateWithCount {
	public static void main(String[] args) {
		 // ArrayList with duplicate elements
        ArrayList<Integer> numbersList
        = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8,0,0,0));
         
        Map<Integer, Long> elementCountMap = numbersList.stream()
       // .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
        .collect(Collectors.groupingBy(k -> k, Collectors.counting()));
         
        
        System.out.println("*****Array List***********");
        System.out.println(elementCountMap);
        
        System.out.println();
        System.out.println("*****countByStreamGroupBy fun logic***********");
        System.out.println(countByStreamGroupBy(numbersList));
        
        System.out.println();
        System.out.println("*****countByStreamGroupBy fun logic***********");
        System.out.println(countByClassicalLoop(numbersList));
	}
	
	
	// countByStreamGroupBy
	
	public static  Map<Integer, Long> countByStreamGroupBy(List<Integer> inputList) {
	    return inputList.stream().collect(Collectors.groupingBy(k -> k, Collectors.counting()));
	}
	
	
	//countByClassicalLoop
	//public static <T> Map<T, Long> countByClassicalLoop(List<T> inputList)
	public static  Map<Integer, Long> countByClassicalLoop(List<Integer> inputList) {
	    Map<Integer, Long> resultMap = new HashMap<>();
	    for (Integer element : inputList) {
	        if (resultMap.containsKey(element)) {
	            resultMap.put(element, resultMap.get(element) + 1L);
	        } else {
	            resultMap.put(element, 1L);
	        }
	    }
	    return resultMap;
	}

}
