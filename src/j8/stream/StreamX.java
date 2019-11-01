package j8.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * A Stream in Java can be defined as a sequence of elements from a source that supports aggregate operations on them. 
 * The source here refers to a Collections or Arrays who provides data to a Stream.
 * 
 * Stream keeps the ordering of the data as it is in the source. The aggregate operations or bulk operations are operations 
 * which allow us to express common manipulations on stream elements easily and clearly.
 * 
 * Table of Contents

	1. Streams vs. Collections
	2. Different ways to create streams
	3. Converting streams to collections
	4. Core stream operations
	    4.1. Intermediate operations
	    4.2. Terminal operations
	5. Short-circuit operations
	6. Parallelism

	Before going ahead, it is important to learn that Java 8 Streams are designed in such a way that most of the stream operations returns streams only. 
	This help us creating chain of the stream operations. This is called as pipe-lining. I will use this term multiple times in this post, so keep it in mind.
	
	1. Java Stream vs. Collection
	
	All of us have watch online videos on youtube or some other such website. When you start watching video, a small portion of file is first loaded into your 
	computer and start playing. You don’t need to download complete video before start playing it. This is called streaming. 
	I will try to relate this concept with respect to collections and differentiate with Streams.
	
	At the basic level, the difference between Collections and Streams has to do with when things are computed. A Collection is an in-memory data structure, 
	which holds all the values that the data structure currently has—every element in the Collection has to be computed before it can be added to the Collection. 
	A Stream is a conceptually fixed data structure, in which elements are computed on demand. This gives rise to significant programming benefits. 
	The idea is that a user will extract only the values they require from a Stream, and these elements are only produced—invisibly to the user—as and when required. 
	This is a form of a producer-consumer relationship.
	
	In java, java.util.Stream represents a stream on which one or more operations can be performed. Stream operations are either intermediate or terminal. 
	While terminal operations return a result of a certain type, intermediate operations return the stream itself so you can chain multiple method calls in a row. 
	Streams are created on a source, e.g. a java.util.Collection like lists or sets (maps are not supported). Stream operations can either be executed sequential or parallel.
	
	Based on above points, if we list down the various characteristics of Stream, they will be as follows:
	
	    Not a data structure
	    Designed for lambdas
	    Do not support indexed access
	    Can easily be outputted as arrays or lists
	    Lazy access supported
	    Parallelizable
 * @author developer
 *
 */
public class StreamX {
	public void streamOfVal1Val2Val3() {
		System.out.println("Values");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));
	}

	public void streamOfArray() {
		System.out.println("Array");
		Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream.forEach(p -> System.out.println(p));
	}

	public void streamOfList() {
		System.out.println("List");
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}
	/**
	 * Infinitive loop
	 */
	public void streamGenerateIterate() {
		System.out.println("Generate and iterate");
		Stream<Date> stream = Stream.generate(() -> {
			return new Date();
		});
		stream.forEach(p -> System.out.println(p));
	}

	public void streamCharOrTokens() {
		//chars ascii values
		IntStream stream = "12345_abcdefg".chars();
		stream.forEach(p -> System.out.println(p));

		// OR

		Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
		stream2.forEach(p -> System.out.println(p));
	}

	public void streamToList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
	}
	 public void streamToArray(){
         List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         Stream<Integer> stream = list.stream();
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         System.out.println(evenNumbersArr);
     }

}
