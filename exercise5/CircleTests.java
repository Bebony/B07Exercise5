package exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testArea1() {
		Point p = new Point(1, 5);
		double r = 20;
		Circle c = new Circle(p, r);
		double expected = Math.PI * 400;
		assertEquals(expected, c.area(), 0.00001);
	}
	
	@Test
	void testArea2() {
		Point p = new Point(0, 0);
		double r = 12.5;
		Circle c = new Circle(p, r);
		double expected = Math.PI * 156.25;
		assertEquals(expected, c.area(), 0.00001);
	}
	
	@Test
	void testCircumference1() {
		Point p = new Point(1, 10);
		double r = 10;
		Circle c = new Circle(p, r);
		double expected = 2 * Math.PI * 10;
		assertEquals(expected, c.circumference(), 0.00001);
	}
	
	@Test
	void testCircumference2() {
		Point p = new Point(0, 0);
		double r = 35.5;
		Circle c = new Circle(p, r);
		double expected = 2 * Math.PI * 35.5;
		assertEquals(expected, c.circumference(), 0.00001);
	}

}
