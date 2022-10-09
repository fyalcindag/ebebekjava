package ebebek_project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the worker.");
		String name = scan.next();
		System.out.println("Enter the salary of the worker.");
		int salary = scan.nextInt();
		System.out.println("Enter the Work Hours of the worker.");
		int workHours = scan.nextInt();
		System.out.println("Enter the Hired Year of the worker.");
		int hiredYear = scan.nextInt();
		scan.close();
		
		Employee employee = new Employee(name, salary, workHours, hiredYear );
		System.out.println(employee);
		employee.total_salary();
		

	}

}