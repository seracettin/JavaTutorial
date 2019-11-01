package j8.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMain {
	public static void main(String[] args) {
		createCustomAction();
		
	 

	}
	public static void streamForEach() {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	     
		Consumer<Integer> action = System.out::println;
		 
		numberList.stream().filter(n -> n%2  == 0).forEach( action );
	}
	public static void listForEach() {
		ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
	     
		Consumer<Integer> action = System.out::println;
		 
		numberList.forEach(action);
	}
	public static void mapForEach() {
		HashMap<String, Integer> map = new HashMap<>();
	     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		 
		//1. Map entries
		Consumer<Map.Entry<String, Integer>> action = System.out::println;
		 
		map.entrySet().forEach(action);
		 
		//2. Map keys
		Consumer<String> actionOnKeys = System.out::println;
		 
		map.keySet().forEach(actionOnKeys);
		 
		//3. Map values
		Consumer<Integer> actionOnValues = System.out::println;
		 
		map.values().forEach(actionOnValues);
	}
	
	public static void createCustomAction() {
		HashMap<String, Integer> map = new HashMap<>();
	     
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		 
		Consumer<Map.Entry<String, Integer>> action = entry -> 
		{ 
		    System.out.println("Key is : " + entry.getKey()); 
		    System.out.println("Value is : " + entry.getValue()); 
		}; 
		 
		map.entrySet().forEach(action);
	}
}
