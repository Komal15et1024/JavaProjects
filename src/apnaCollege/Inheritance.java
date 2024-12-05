package apnaCollege;



class Shape{
	public void area() {
		System.out.println("Displays area");
	}
}

class Triangle extends Shape{
	public void area(int l, int h) {
		System.out.println(0.5*l*h);
	}
}

class EquilateraTriangle extends Triangle{
	public void area(int l , int h) {
		System.out.println(0.5*l*h);
	}
}

class Circle extends Shape{
	public void area(int r) {
		System.out.println((3.14)*r*r);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		// Creating objects for different shapes
        Shape s = new Shape();
        Triangle t = new Triangle();
        EquilateraTriangle eT = new EquilateraTriangle();
        Circle c = new Circle();

        // Displaying generic area method
        s.area();

        // Calculating area for Triangle
        t.area(10, 5); // Base = 10, Height = 5

        // Calculating area for Equilateral Triangle
        eT.area(8, 4); // Base = 8, Height = 4

        // Calculating area for Circle
        c.area(7); // Radius = 7

	}

}
