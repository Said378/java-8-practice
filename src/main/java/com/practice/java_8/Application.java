package com.practice.java_8;

import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<String> Strings = List.of("Java 8", "Java 9", "Java 10", "Java 11", "Java 12", "Java 13", "Java 14",
				"Java 15", "Java 16", "Java 17");
		
		Practice1.limitStringList(Strings);
	}
}
