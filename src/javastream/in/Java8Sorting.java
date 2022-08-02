package javastream.in;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Sorting {

	public static void main(String[] args) {

		List<String> students = Arrays.asList(
				"Sandeep", "Abhinav", "Gaurav",
				"Prince", "Rohit", "Deepika");

		System.out.println("==== BEFORE SORTING =====");

		students.stream().forEach(System.out::println);

		System.out.println("==== AFTER SORTING =====");

	//	students.stream().sorted().forEach(System.out::println);
		
		// Old days technique
	//	students.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);
		
		students.stream().sorted().forEach(s->System.out.println(s));
		
		
		System.out.println("==== AFTER SORTING (REVERED ORDER) =====");
		
		//old method
		//students.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);

		students.stream().sorted(Comparator.reverseOrder())
				.forEach(s->System.out.println(s));

	}
}