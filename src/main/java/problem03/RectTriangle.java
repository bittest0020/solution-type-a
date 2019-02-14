package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return width*height;
	}

	@Override
	public double getPerimeter() {
		
		return (width+height)*2;
	}
}
