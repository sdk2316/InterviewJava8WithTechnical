package javastream.in;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateUsingStream {

	public static void main(String[] args) {
		 // 1. list of Strings
	    List<String> companies = new ArrayList<String>();


	    // 1.1 add string elements to List
	    companies.add("Meta");
	    companies.add("Apple");
	    companies.add("Amazon");
	    companies.add("Netflix");
	    companies.add("Meta"); // duplicate
	    companies.add("Google");
	    companies.add("Apple"); // duplicate


	    // 1.2 print original List to console
	    System.out.println("1. Original List with duplicates : \n");
	    companies.forEach(System.out::println);


	    // 2. get unique elements after removing duplicates
	    List<String> distinctCompanies = companies
	            .stream()
	            .distinct()
	            .collect(Collectors.toList());


	    // 2.1 print unique elements
	    System.out.println("\n2. Unique elements : \n");
	    distinctCompanies.forEach(System.out::println);


	    // 3. get duplicate elements
	    for (String distinctCompany : distinctCompanies) {
	    	
	    	//once all unique record removed then we will get only duplicate data in companies
	        companies.remove(distinctCompany);
	    }


	    // 3.1 print duplicate elements
	    System.out.println("\n3. Duplicate elements : \n");
	    companies.forEach(System.out::println);
	}

	
}