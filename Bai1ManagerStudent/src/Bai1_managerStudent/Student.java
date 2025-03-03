package Bai1_managerStudent;


public class Student {
	public int id;
	public int age;
	public String name;
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString () {
		return "id: " + id + " age: "+ age+ " name: "+ name+ ".";
	}
}
