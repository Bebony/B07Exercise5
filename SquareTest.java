package exercise5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testPerimeter1() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(-1, 1);
		Point p3 = new Point(1, -1);
		Point p4 = new Point(-1, -1);
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.perimeter(), 8.0);
	}
	
	@Test
	void testPerimeter2() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(-1, 0);
		Point p3 = new Point(0, 1);
		Point p4 = new Point(0, -1);
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.perimeter(), 4*Math.sqrt(2));
	}
	
	@Test
	void testArea1() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(-1, 1);
		Point p3 = new Point(1, -1);
		Point p4 = new Point(-1, -1);
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.area(), 4);
	}
	
	@Test
	void testArea2() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(-1, 0);
		Point p3 = new Point(0, 1);
		Point p4 = new Point(0, -1);
		Square s = new Square(p1, p2, p3, p4);
		assertEquals(s.area(), 2);
	}
	
	@Test
	void testIsSquare1() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(-1, 1);
		Point p3 = new Point(1, -1);
		Point p4 = new Point(-1, -1);
		Square s = new Square(p1, p2, p3, p4);
		assertTrue(s.isSquare());
	}
	
	@Test
	void testIsSquare2() {
		Point p1 = new Point(1, 10);
		Point p2 = new Point(-1, 1);
		Point p3 = new Point(1, -1);
		Point p4 = new Point(-1, -1);
		Square s = new Square(p1, p2, p3, p4);
		assertFalse(s.isSquare());
	}

}
