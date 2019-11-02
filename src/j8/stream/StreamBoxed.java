package j8.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 *
 * To convert a stream of primitives, you must first box the elements in their
 * wrapper class and then collect them. This type of stream in called boxed stream.
 * @author Angel Eyes
 *
 */
public class StreamBoxed {

	public StreamBoxed() {
		super();
		List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());

		/*Type mismatch: cannot convert from List<String> to List<Integer>
		 *
		 * List<Integer> kk = Stream.of("how", "to", "do", "in", "java")
		 * .collect(Collectors.toList());
		 */

		//1. IntStream – stream of ints

		List<Integer> ints = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .collect(Collectors.toList());

		System.out.println(ints);


		Optional<Integer> max = IntStream.of(1,2,3,4,5)
		                .boxed()
		                .max(Integer::compareTo);

		System.out.println(max);

		//2. LongStream – stream of longs

		List<Long> longs = LongStream.of(1l,2l,3l,4l,5l)
                .boxed()
                .collect(Collectors.toList());

		System.out.println(longs);

		//3. DoubleStream – stream of doubles

		List<Double> doubles = DoubleStream.of(1d,2d,3d,4d,5d)
                .boxed()
                .collect(Collectors.toList());

		System.out.println(doubles);


	}

}
