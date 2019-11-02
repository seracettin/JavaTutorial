package j8.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodReferenceMain {

	public static void main(String[] args) {

		List<Integer> integers3 = IntStream
                .range(1, 10)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));

		Optional<Integer> max3 = integers3.stream().reduce(Math::max);

		max3.ifPresent(System.out::println);
	}

	public static void test() {
		//2. Method reference to static method – Class::staticMethodName
		List<Integer> integers = Arrays.asList(1,12,433,5);

		Optional<Integer> max = integers.stream().reduce( Math::max );

		max.ifPresent(value -> System.out.println(value));

		//3. Method reference to instance method from instance – ClassInstance::instanceMethodName
		List<Integer> integers1 = Arrays.asList(1,12,433,5);

		Optional<Integer> max1 = integers1.stream().reduce( Math::max );

		max1.ifPresent( System.out::println );

		//4. Method reference to instance method from class type – Class::instanceMethodName
		List<String> strings = Arrays
		        .asList("how", "to", "do", "in", "java", "dot", "com");

		List<String> sorted = strings
		        .stream()
		        .sorted((s1, s2) -> s1.compareTo(s2))
		        .collect(Collectors.toList());

		System.out.println(sorted);

		List<String> sortedAlt = strings
		        .stream()
		        .sorted(String::compareTo)
		        .collect(Collectors.toList());

		System.out.println(sortedAlt);

		//5. Reference to constructor – Class::new
		List<Integer> integers3 = IntStream
                .range(1, 100)
                .boxed()
                .collect(Collectors.toCollection( ArrayList::new ));

		Optional<Integer> max3 = integers3.stream().reduce(Math::max);

		max3.ifPresent(System.out::println);

	}

}
