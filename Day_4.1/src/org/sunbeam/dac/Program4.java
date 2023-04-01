package org.sunbeam.dac;
public class Program4 {
	public static void main(String[] args) {
		Employee2 E1 = new Employee2();
		E1.setName("nikita");
		
		Employee2 E2 = new Employee2();
		E2.setName("Mahendra");
		E2.getName();
		E2.setEmpid(3);
		E2.getEmpid();
		E2.setSalary(45000);
		E2.getSalary();
		
	}
		
}
class Employee2{
	private String name;
	private int empid;
	private float salary;
	
	//get=> inspector/Selector/Getter
	//set=> Mutator/Modifier/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		if(salary>=15000 && salary <=200000)
		   this.salary = salary;
		else 
			throw new IllegalArgumentException("Invalid salary");
	}
}

