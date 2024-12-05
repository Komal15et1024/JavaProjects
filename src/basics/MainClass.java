package basics;

import encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.age = 23;
//		p1.name = "Sally";
//		
//		Person p2 = new Person();
//		p2.age = 29;
//		p2.name = "Ray";
		
//		System.out.println(p1.age + " " + p1.name);
//		System.out.println(p2.age + " " + p2.name);
		
//		p1.eat();
//		p2.walk();
//		p2.walk(2);
//		System.out.println(Person.count);
		
//		Developer d1 = new Developer(27,"Lisa");
//		d1.doWork();
		
		EncapsulationIntro obj = new EncapsulationIntro();
		
//		obj.doWork();
		
	}
}


class Developer extends Person{

	public Developer(int age, String name) {
		super(age, name);
	}

}

class Person{
	String name;
	int age;
	static int count;
	
//	public Person() {
//		count++;
//		System.out.println("creating an object");
//	}
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
	
	void doWork() {
		System.out.println(name + " is working.");
	}
}
