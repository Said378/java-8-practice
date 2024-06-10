package com.practice.java_8;

import java.util.List;
import java.util.stream.Stream;

public class Practice1 {

	/**
	 * Stream API is a set of operations that can be performed on a collection of
	 * data.
	 * 
	 * @param Strings is the collection of data that we can operate on.
	 * 
	 * some methods of stream object are called intermediate
	 * operations that are instructions of things to do, but do not
	 * return anything.
	 * 
	 * some methods of stream object are called terminal operations
	 * that are methods that return something to you.
	 * 
	 */

	public static void limitStringList(List<String> Strings) {
		

		Stream<String> limit = Strings.stream().limit(3); // limit() method returns maximum 3 elements from the stream
															// to be run it need terminal operation

		long count = limit.count(); // count() method returns the number of elements in the stream (terminal
									// operation)

		System.out.println(count);
	}
}
