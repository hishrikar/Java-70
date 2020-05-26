package co.edureka;

public class Student {
	private String name;

	public Student() {
		System.out.println("Inside zero argument constructor");
	}

	public Student(String name) {
		System.out.println("Inside one argument constructor");
		this.name = name;
	}

	public String getName() {
		System.out.println("Inside getter method");
		return this.name;
	}

	public void setName(String name) {
		System.out.println("Inside setter method");
		this.name = name;
	}

	public String toString() {
		return "Student [ " + name + " ] ";
	}
	
	public void myInit1() {
		System.out.println("User-defined init method-1");
	}
	public void myInit2() {
		System.out.println("User-defined init method-2");
	}	
	public void myDestroy() {
		System.out.println("User-defined destructor");
	}	
}
