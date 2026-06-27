package B07Exercise5;

public class Square {
    Point A;
    Point B;
    Point C;
    Point D;

    public Square(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double perimeter() {
        return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
    }

    public double area() {
        double side = A.distance(B);
        return side * side;
    }

    public boolean isSquare() {
        double dAB = A.distance(B);
        double dBC = B.distance(C);
        double dCD = C.distance(D);
        double dDA = D.distance(A);
        return dAB == dBC && dBC == dCD && dCD == dDA;
    }
}