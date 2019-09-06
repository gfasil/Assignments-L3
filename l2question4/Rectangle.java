package L3HW;

public final class Rectangle {
	private final double width;
	private final double height;
	
	public Rectangle(double width, double height) {
		this.height= height;
		this.width=width;
		}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	public double computeArea(double x,double y) {
		
		return x*y;
	}
	
}
