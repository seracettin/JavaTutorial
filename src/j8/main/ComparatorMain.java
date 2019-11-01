package j8.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import j8.comparator.Employee;
import j8.enums.SortEnum;

public class ComparatorMain {

	public static void main(String[] args) {
		//sortByFirstName(SortEnum.DESC_ORDER);
		
		//sortMultipleFields();
		
		sortParallel();

	}

	public static void sortByFirstName(SortEnum sortType) {
		List<Employee> employees = getEmployees();

		if(sortType == SortEnum.ASC_ORDER)
			employees.sort(Comparator.comparing(e -> e.getFirstName()));
		else{
			Comparator<Employee> comparator = Comparator.comparing(e -> e.getFirstName());
		    employees.sort(comparator.reversed());
		}
		System.out.println(employees);
	}

	public static void sortMultipleFields() {
		List<Employee> employees = getEmployees();
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);
		employees.sort(groupByComparator);

		System.out.println(employees);
	}
	/**
	 * Parallel using multiple threads as well. 
	 * It is going to be very fast if collection is big enough having thousands of objects. 
	 * For small collection of objects, normal sorting is good enough and recommended.
	 */
	public static void sortParallel() {
		List<Employee> employees = getEmployees();
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);
		Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
		 
		//Parallel sorting
		Arrays.parallelSort(employeesArray, groupByComparator);
		
		for(Employee ee:employeesArray)
		System.out.println(ee);
	}
	private static List<Employee> getEmployees(){
	    List<Employee> employees  = new ArrayList<>();
	    employees.add(new Employee(6,"Yash", "Chopra", 25));
	    employees.add(new Employee(2,"Aman", "Sharma", 28));
	    employees.add(new Employee(3,"Aakash", "Yaadav", 52));
	    employees.add(new Employee(5,"David", "Kameron", 19));
	    employees.add(new Employee(11,"Aakary", "Cemon", 19));
	    employees.add(new Employee(4,"James", "Hedge", 72));
	    employees.add(new Employee(8,"Balaji", "Subbu", 88));
	    employees.add(new Employee(7,"Karan", "Johar", 59));
	    employees.add(new Employee(1,"Lokesh", "Gupta", 32));
	    employees.add(new Employee(9,"Vishu", "Bissi", 33));
	    employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
	    return employees;
	}

}
