import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTests {

    @Test
    void testRectanglePerimeter() {
        // A standard 2x3 rectangle
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(3, 2);
        Point d = new Point(3, 0);
        Rectangle r = new Rectangle(a, b, c, d);
        // Perimeter = 2 + 3 + 2 + 3 = 10
        assertEquals(10.0, r.perimeter(), 0.0001);
    }

    @Test
    void testIsRectangleTrue() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(3, 2);
        Point d = new Point(3, 0);
        Rectangle r = new Rectangle(a, b, c, d);
        assertTrue(r.isRectangle());
    }

    @Test
    void testIsRectangleFalseFirstCondition() {
        // Fails because dAB != dCD
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(4, 2);
        Point d = new Point(3, 0);
        Rectangle r = new Rectangle(a, b, c, d);
        assertFalse(r.isRectangle());
    }

    @Test
    void testIsSquareTrue() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 2);
        Point d = new Point(2, 0);
        Rectangle r = new Rectangle(a, b, c, d);
        assertTrue(r.isSquare());
    }

    @Test
    void testIsSquareFalseFirstCondition() {
        // Standard rectangle: Fails because dAB != dBC
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(3, 2);
        Point d = new Point(3, 0);
        Rectangle r = new Rectangle(a, b, c, d);
        assertFalse(r.isSquare());
    }
}