package javastream.model;

import java.util.Arrays;
import java.util.List;

public class FindEmployeeMaxSalary {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(101, "Manish", 5000, "IT"),
				new Employee(109, "Atul", 3000, "HR"),
				new Employee(111, "Santosh", 4400, "IT"),
				new Employee(109, "Rupendra", 3200, "FIN")
				);

		// return max salary
		int maxSalary = employees.stream()
								 .map(Employee::getSalary)
								 .max(Integer::compare).get();

		System.out.println("Max salary of the employee:" + maxSalary);
		System.out.println();
		System.out.print("Employee details:");
		
		//filter the employee having max salary
		employees.stream()
				 .filter(emp -> emp.getSalary() == maxSalary)
				 .forEach(System.out::println);		 

	}

}
