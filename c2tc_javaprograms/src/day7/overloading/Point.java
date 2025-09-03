package day7.overloading;

public class Point {
	private float x;
	private float y;

	public Point() {
		x = 0.0f;
		y = 0.0f;
	}

	public Point(float x) {
		this.x = x; //it refers to the instance of class and the x value passes to the parameter
		this.y = x;
	}

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
