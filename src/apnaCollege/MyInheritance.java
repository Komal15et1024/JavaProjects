package apnaCollege;


class Shape2{
	public void sides() {
		System.out.println("I don't know");
	}
}

class Triangle1 extends Shape2{
	@Override
	public void sides() {
		System.out.println("I have three sides");
	}
}

class EquilateralTriangle1 extends Triangle1{
	@Override
	public void sides() {
		System.out.println("I have three sides");
	}
}

class Circle1 extends Shape2{
	@Override
	public void sides() {
		System.out.println("I have no sides");
	}
}


public class MyInheritance {

	public static void main(String[] args) {
		Shape2 s = new Shape2();
		Shape2 triangle = new Triangle1();
		Shape2 eT = new EquilateralTriangle1();
		Shape2 c = new Circle1();
		
		s.sides();
		triangle.sides();
		eT.sides();
		c.sides();

	}

}

