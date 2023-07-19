package GitGeom;

public class Circle {
	private Point2D centrPoint;
	private double radius;

	public Circle(Point2D centrPoint, double radius) {
		super();
		this.centrPoint = centrPoint;
		this.radius = radius;
	}

	public Point2D getCentrPoint() {
		return centrPoint;
	}

	public void setCentrPoint(Point2D centrPoint) {
		this.centrPoint = centrPoint;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [centrPoint=" + centrPoint + ", radius=" + radius + "]";
	}

}
