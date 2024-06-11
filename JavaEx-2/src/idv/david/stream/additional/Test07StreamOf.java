package idv.david.stream.additional;

import java.util.stream.Stream;

public class Test07StreamOf {

	public static void main(String[] args) {
		// Easily create a stream
		Stream.of("Monday", "Tuesday","Wedensday", "Thursday")
	      .filter(s -> s.startsWith("T"))
	      .forEach(s -> System.out.println("Matching Days: " + s));
	}

}
