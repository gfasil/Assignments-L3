package L3HW;

public final class Circle {
	private final double radius;
	
	
	public Circle(double radius) {
		
		this.radius=radius;
		
		
		
	}
	
	public double getRadius() {
		return radius;
	}

	public double computeArea(double x) {
		
		return Math.PI*Math.pow(x, 2) ;
	}
	
}
