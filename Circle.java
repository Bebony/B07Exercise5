package exercise5;

public class Circle {
	Point centre;
	double radius;

	public Circle(Point centre, double radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double circumference() {
		return 2 * Math.PI * radius;
	}
}
