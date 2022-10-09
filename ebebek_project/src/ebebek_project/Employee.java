package ebebek_project;

public class Employee {
	private String name;
	private int salary;
	private int workHours;
	private int hireYear;
	
	public Employee(String name, int salary,  int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getWorkHours() {
		return workHours;
	}


	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}


	public int getHireYear() {
		return hireYear;
	}


	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}


	public int tax() {
		int tax = 0;
		salary = this.getSalary();
		if(salary < 1000){
			tax = 0;
		}
		else if(salary > 1000) {
			tax = salary * 3 /100;
		}
		return tax;
	}
	
	public int bonus() {
		workHours = this.getWorkHours();
		int bonus_payment = 0;
		if(workHours > 40) {
			int bonus_hours = workHours - 40;
			bonus_payment = bonus_hours * 30;
		}
		return bonus_payment;
	}
	
	public int raiseSalary() {
		int raise_salary = 0;
		salary = this.getSalary();
		hireYear = this.getHireYear();
		int CURRENT_YEAR = 2021;
		int WORKED_YEAR = CURRENT_YEAR - hireYear;
		if(WORKED_YEAR < 10) {
			raise_salary = salary * 5 /100;
		}
		else if(WORKED_YEAR > 9 && WORKED_YEAR < 20) {
			raise_salary = salary * 10 /100;
		}
		else if(WORKED_YEAR > 19) {
			raise_salary = salary *10/100;
		}
		return raise_salary;
		
	}
	
	public int total_salary() {
		int total_salary = this.salary + this.raiseSalary() - this.tax() + this.bonus();
		return total_salary;
	}
	
	public String toString() {
		return "Name of the worker: "+ name + "\n" +
				"Salary of the worker before raising the salary: " + salary + " $ \n" +
				"Work Hours: " + workHours + " Hours \n" +
				"Hired year: " + hireYear + "\n" +
				"Tax of the worker: " + this.tax() + " $ \n" +
				"Bonus of the worker: " + this.bonus() + " $ \n" +
				"Raise salary of the worker: "  + this.raiseSalary() + " $ \n" +
				"Net salary after raise, bonus and taxes is: " + this.total_salary() + " $ \n";
				
	}
}


