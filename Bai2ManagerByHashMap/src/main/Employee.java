package main;

public class Employee {
	private int id;
	private String name;
	private String position;
	private double salary;
	private String managerId;
	
	public Employee(int id, String name, String position, double salary, String managerId) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.managerId = managerId;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public double getSalary() {
		return salary;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setId(int id) {
		this.id =  id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	@Override
	public String toString() {
		return "id: " + id +
				"name: " + name + 
				"position: "+ position +
				"salary: "+ salary + 
				"managerId: "+ managerId + "!";
	}
}
