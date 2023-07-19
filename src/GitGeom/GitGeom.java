package GitGeom;

public class GitGeom {

	public static void main(String[] args) {
		Point2D p = new Point2D(0.0, 0.0);
		System.out.println("p = " + p);
		System.out.println("p.X = " + p.getX());
		System.out.println("p.Y = " + p.getY());
		Circle CircleOne = new Circle(new Point2D(1.0, 1.0), 1.0);
		System.out.println("CircleOne = " + CircleOne);
	}

}
