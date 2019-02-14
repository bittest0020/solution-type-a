package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		
		width = width *rate;
	}

	@Override
	public double getArea() {
		
		return width*height;
	}

	@Override
	public double getPerimeter() {
		
		double cross = Math.sqrt((width*width)+(height*height));
		
		return width + height + cross;
	}

	
	
	
	
}