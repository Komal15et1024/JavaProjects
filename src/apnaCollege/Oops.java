package apnaCollege;


class Pen{
	String color;
	String type; //ballpoint;gel
	
	public void write() {
		System.out.println("writing something");
	}
	public void printColor() {
		System.out.println(this.color);
	}
}


//polymorphism

//if a function has same name then it's function overloading means creating same function in one class
class Student{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name + "" + age);
	}

}

public class Oops {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Louis";
		s1.age = 35;
		
		s1.printInfo(s1.age);
	}

}
