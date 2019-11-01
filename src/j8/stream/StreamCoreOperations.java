package j8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCoreOperations {
	private List<String> memberNames = new ArrayList<>();

	public StreamCoreOperations() {
		super();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		
		
	}

	public void basicOperations() {
		// FILTER
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

		// MAP
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

		// SORTED
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

		// FOREACH
		memberNames.forEach(System.out::println);

		// COLLECT
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.print(memNamesInUppercase);

		// MATCH
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println(matchedResult);

		// COUNT
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
		System.out.println(totalMatched);

		// REDUCE
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);
		// Output: Amitabh#Shekhar#Aman#Rahul#Shahrukh#Salman#Yana#Lokesh

		// ANY MATCH
		boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println(matched);

		// FIND FIRST
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();

		System.out.println(firstMatchedName);
	}
	
	public  void streamParallelism(){
        List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 1000000; i++){
             list.add(i);
         }
         //Here creating a parallel stream
         Stream<Integer> stream = list.parallelStream();  
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.print(evenNumbersArr);
     }
	
	
	
}
