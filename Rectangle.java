public class Rectangle {
	Point A;
	Point B;
	Point C;
    Point D;
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
        this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}

    public boolean isRectangle(){
        double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
        double dDA = D.distance(A);

        double diagonalAC = A.distance(C);
        double diagonalBD = B.distance(D);

        return dAB==dCD && dBC == dDA && diagonalAC == diagonalBD;
    }
	
	public boolean isSquare() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
        double dDA = D.distance(A);

        double diagonalAC = A.distance(C);
        double diagonalBD = B.distance(D);

		return dAB==dBC && dBC==dCD && dCD == dDA && diagonalAC == diagonalBD;
	}
}
