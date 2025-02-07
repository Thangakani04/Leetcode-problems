package Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class EmployeeStreamClass {

	
	private String name ;
	private int id;
	private String dept;
	private double salary;
	
			
	public EmployeeStreamClass(String name, int id, String dept, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeStreamClass [name=" + name + ", id=" + id + ", dept=" + dept + ", salary=" + salary + "]";
	}

}

public class EmployeeStream {
	
	public static void main(String[] args) {
		
		List<EmployeeStreamClass> emp = Arrays.asList(
				new EmployeeStreamClass("Rajan",1,"IT",20000.00),
				new EmployeeStreamClass("Saras",2,"IT",40000.00),
				new EmployeeStreamClass("Thangam",3,"IT",10000.00),
				new EmployeeStreamClass("Pinky",4,"IT",50000.00)
				);
		
		EmployeeStreamClass highsalary = emp.stream().max(Comparator.comparing(EmployeeStreamClass::getSalary)).orElse(null);
		System.out.println("Highest salary is :" + highsalary);
		
		List<EmployeeStreamClass> sortedList = emp.stream().sorted(Comparator.comparing(EmployeeStreamClass::getName)
				.thenComparing(EmployeeStreamClass::getSalary)).collect(Collectors.toList());
		
		System.out.println("\nSorted list of employee is :");
		sortedList.forEach(System.out::println);
				
	}

}
